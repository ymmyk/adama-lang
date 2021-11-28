package org.adamalang.runtime.threads;

import org.adamalang.runtime.contracts.ActiveKeyStream;
import org.adamalang.runtime.contracts.Callback;
import org.adamalang.runtime.contracts.DataService;
import org.adamalang.runtime.contracts.Key;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** an implementation of data service that federates out by hashing keys to executors */
public class ThreadedDataService implements DataService {

    private final ExecutorService[] executors;
    private final DataService[] services;

    public ThreadedDataService(int nThread, Supplier<DataService> dataServiceSupplier) {
        this.executors = new ExecutorService[nThread];
        this.services = new DataService[nThread];
        for (int k = 0; k < nThread; k++) {
            this.executors[k] = Executors.newSingleThreadExecutor(new NamedThreadFactory("dataservice-" + k));
            this.services[k] = dataServiceSupplier.get();
        }
    }

    public CountDownLatch shutdown() {
        CountDownLatch latch = new CountDownLatch(executors.length);
        for (int k = 0; k < executors.length; k++) {
            ExecutorService executor = executors[k];
            executor.execute(() -> {
                executor.shutdown();
                latch.countDown();
            });
        }
        return latch;
    }

    @Override
    public void scan(ActiveKeyStream stream) {
        executors[0].execute(() -> {
            this.services[0].scan(stream);
        });
    }

    /** internal: enter an executor for the given key */
    private void at(Key key, Consumer<DataService> next) {
        int tId = key.hashCode() % executors.length;
        executors[tId].execute(() -> {
            next.accept(services[tId]);
        });
    }

    @Override
    public void get(Key key, Callback<LocalDocumentChange> callback) {
        at(key, (service) -> service.get(key, callback));
    }

    @Override
    public void initialize(Key key, RemoteDocumentUpdate patch, Callback<Void> callback) {
        at(key, (service) -> service.initialize(key, patch, callback));
    }

    @Override
    public void patch(Key key, RemoteDocumentUpdate patch, Callback<Void> callback) {
        at(key, (service) -> service.patch(key, patch, callback));
    }

    @Override
    public void compute(Key key, ComputeMethod method, int seq, Callback<LocalDocumentChange> callback) {
        at(key, (service) -> service.compute(key, method, seq, callback));
    }

    @Override
    public void delete(Key key, Callback<Void> callback) {
        at(key, (service) -> service.delete(key, callback));
    }
}
