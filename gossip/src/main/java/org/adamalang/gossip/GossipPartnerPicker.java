package org.adamalang.gossip;

import java.util.*;

public class GossipPartnerPicker {
    private final InstanceSetChain chain;
    private final HashSet<String> initial;
    private final ArrayList<String> peers;
    private String cachedPeersHash;
    private final Random rng;
    private HashMap<String, Integer> counts;

    public GossipPartnerPicker(InstanceSetChain chain, HashSet<String> initial, Random rng) {
        this.chain = chain;
        this.initial = initial;
        this.rng = rng;
        this.peers = new ArrayList<>();
        this.counts = new HashMap<>();
        this.cachedPeersHash = "";
    }

    private int countOf(String target) {
        Integer count = counts.get(target);
        if (count == null) {
            return 0;
        }
        return count;
    }

    public String pick() {
        if (!cachedPeersHash.equals(chain.current().hash())) {
            peers.clear();
            TreeSet<String> set = new TreeSet<>(initial);
            set.addAll(chain.current().targetsFor("gossip"));
            peers.addAll(set);
        }
        String a = peers.get(rng.nextInt(peers.size()));
        String b = peers.get(rng.nextInt(peers.size()));
        int x = countOf(a);
        int y = countOf(b);
        if (x < y) {
            counts.put(a, x + 1);
            return a;
        } else {
            counts.put(b, y + 1);
            return b;
        }
    }
}
