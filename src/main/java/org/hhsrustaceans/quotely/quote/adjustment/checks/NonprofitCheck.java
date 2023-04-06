package org.hhsrustaceans.quotely.quote.adjustment.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;
import org.hhsrustaceans.quotely.quote.adjustment.AdjustmentCheck;
import org.hhsrustaceans.quotely.quote.adjustment.types.AdjustmentPercentage;

import java.util.ArrayList;
import java.util.List;

public class NonprofitCheck implements AdjustmentCheck {
    public List<ValueAdjustment> getAdjustments(Client client) {
        List<ValueAdjustment> deals = new ArrayList<>();

        if (client.getType().equals(ClientType.NONPROFIT)) {
            deals.add(new AdjustmentPercentage("Nonprofit discount", -10.0));
        }

        return deals;
    }
}
