package org.hhsrustaceans.quotely.quote.deals;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.deals.checks.*;

import java.util.ArrayList;
import java.util.List;

public class DealManager {
    private Client client;

    private List<DealCheck> checks;

    public DealManager(Client client) {
        this.client = client;
        this.checks = new ArrayList<>();
        this.checks.add(new NonprofitCheck());
        this.checks.add(new RandomCheck());
    }

    public void applyDeals(Component component) {
        for (DealCheck check: checks) {
            component.addDeals(check.getDeals(this.client));
        }
    }
}