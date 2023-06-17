/*
 * This file is subject to the terms and conditions outlined in the
 * file 'LICENSE' (hint: it's MIT-based) located in the root directory
 * near the README.md which you should also read. For more information
 * about the project which owns this file, see https://www.adama-platform.com/ .
 *
 * (c) 2020 - 2023 by Jeffrey M. Barber ( http://jeffrey.io )
 */
package org.adamalang.cli.implementations;

import org.adamalang.api.ApiMetrics;
import org.adamalang.caravan.CaravanMetrics;
import org.adamalang.caravan.data.DiskMetrics;
import org.adamalang.cli.Config;
import org.adamalang.cli.commands.services.distributed.Backend;
import org.adamalang.cli.commands.services.distributed.Frontend;
import org.adamalang.cli.commands.services.distributed.Overlord;
import org.adamalang.cli.commands.services.standalone.Solo;
import org.adamalang.cli.router.Arguments;
import org.adamalang.cli.router.ServicesHandler;
import org.adamalang.cli.runtime.Output;
import org.adamalang.common.net.NetMetrics;
import org.adamalang.extern.aws.AWSMetrics;
import org.adamalang.extern.prometheus.PrometheusDashboard;
import org.adamalang.frontend.FrontendMetrics;
import org.adamalang.mysql.DataBaseMetrics;
import org.adamalang.net.client.ClientMetrics;
import org.adamalang.net.server.ServerMetrics;
import org.adamalang.ops.CapacityMetrics;
import org.adamalang.ops.DeploymentMetrics;
import org.adamalang.overlord.OverlordMetrics;
import org.adamalang.runtime.sys.CoreMetrics;
import org.adamalang.services.FirstPartyMetrics;
import org.adamalang.web.service.WebMetrics;

import java.io.File;

public class ServicesHandlerImpl implements ServicesHandler {
    @Override
    public void auto(Arguments.ServicesAutoArgs args, Output.YesOrError output) throws Exception {
        Config config = args.config;
        String role = config.get_string("role", "none");
        switch (role) {
            case "backend":
                Backend.run(config);
                return;
            case "overlord":
                Overlord.run(config);
                return;
            case "frontend":
                Frontend.run(config);
                return;
            case "solo":
                Solo.run(config);
                return;
            default:
                System.err.println("invalid role:" + role);
        }
    }

    @Override
    public void backend(Arguments.ServicesBackendArgs args, Output.YesOrError output) throws Exception {
        Backend.run(args.config);
    }

    @Override
    public void frontend(Arguments.ServicesFrontendArgs args, Output.YesOrError output) throws Exception {
        Frontend.run(args.config);
    }

    @Override
    public void overlord(Arguments.ServicesOverlordArgs args, Output.YesOrError output) throws Exception {
        Overlord.run(args.config);
    }

    @Override
    public void solo(Arguments.ServicesSoloArgs args, Output.YesOrError output) throws Exception {
        Solo.run(args.config);
    }

    @Override
    public void dashboards(Arguments.ServicesDashboardsArgs args, Output.YesOrError output) throws Exception {
        PrometheusDashboard metricsFactory = new PrometheusDashboard();
        metricsFactory.page("web", "Web");
        new WebMetrics(metricsFactory);
        metricsFactory.page("api", "Public API");
        new FrontendMetrics(metricsFactory);
        new ApiMetrics(metricsFactory);
        metricsFactory.page("client", "Web to Adama");
        new ClientMetrics(metricsFactory);
        metricsFactory.page("server", "Adama Service");
        new ServerMetrics(metricsFactory);
        metricsFactory.page("adama", "Adama Core");
        new CoreMetrics(metricsFactory);
        metricsFactory.page("deploy", "Deploy");
        new DeploymentMetrics(metricsFactory);
        metricsFactory.page("capacity", "Capacity");
        new CapacityMetrics(metricsFactory);
        metricsFactory.page("database", "Database");
        new DataBaseMetrics(metricsFactory);
        metricsFactory.page("caravan", "Caravan");
        new CaravanMetrics(metricsFactory);
        metricsFactory.page("disk", "Disk");
        new DiskMetrics(metricsFactory);
        metricsFactory.page("overlord", "Overlord");
        new OverlordMetrics(metricsFactory);
        metricsFactory.page("net", "Network");
        new NetMetrics(metricsFactory);
        metricsFactory.page("aws", "AWS");
        new AWSMetrics(metricsFactory);
        metricsFactory.page("fp", "First Party");
        new FirstPartyMetrics(metricsFactory);
        metricsFactory.finish(new File("./prometheus/consoles"));
    }
}
