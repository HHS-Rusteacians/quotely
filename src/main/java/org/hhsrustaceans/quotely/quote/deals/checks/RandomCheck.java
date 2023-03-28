package org.hhsrustaceans.quotely.quote.deals.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.deals.Deal;
import org.hhsrustaceans.quotely.quote.deals.DealPercentage;

import java.util.ArrayList;
import java.util.List;

public class RandomCheck implements DealCheck {
    public List<Deal> getDeals(Client client) {
        List<Deal> deals = new ArrayList<>();

        if (Math.random() < 0.5) {
            deals.add(new DealPercentage("Lucky lucky!", 70.0));
        }

        return deals;
    }
}