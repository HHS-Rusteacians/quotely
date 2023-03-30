package org.hhsrustaceans.quotely.quote.deals.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.deals.Deal;
import org.hhsrustaceans.quotely.quote.deals.DealCheck;
import org.hhsrustaceans.quotely.quote.deals.types.DealPercentage;

import java.util.ArrayList;
import java.util.List;

public class NonprofitCheck implements DealCheck {
    public List<Deal> getDeals(Client client) {
        List<Deal> deals = new ArrayList<>();

        if (client.getType().equals(ClientType.NONPROFIT)) {
            deals.add(new DealPercentage("Nonprofit discount", 10.0));
        }

        return deals;
    }
}
