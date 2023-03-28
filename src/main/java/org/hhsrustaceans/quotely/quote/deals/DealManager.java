package org.hhsrustaceans.quotely.quote.deals;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.deals.checks.NonprofitCheck;
import org.hhsrustaceans.quotely.quote.deals.checks.RandomCheck;

import java.util.ArrayList;
import java.util.List;

public class DealManager {
    private List<DealCheck> checks = new ArrayList<DealCheck>();
    public DealManager() {
        checks.add(new NonprofitCheck());
        checks.add(new RandomCheck());
    }

    public void applyDeals(Component component) {
        for (DealCheck check: checks) {
            component.addDeals(check.getDeals(new Client("De Groene Ontmoeting", ClientType.NONPROFIT)));
        }
    }
}