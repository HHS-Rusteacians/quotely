package org.hhsrustaceans.quotely.quote.adjustment.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.adjustment.AdjustmentCheck;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;
import org.hhsrustaceans.quotely.quote.adjustment.types.AdjustmentPercentage;

import java.util.ArrayList;
import java.util.List;

public class RandomCheck implements AdjustmentCheck {
    public List<ValueAdjustment> getAdjustments(Client client) {
        List<ValueAdjustment> deals = new ArrayList<>();

        if (Math.random() < 0.5) {
            deals.add(new AdjustmentPercentage("Lucky lucky!", -70.0));
        } else {
            deals.add(new AdjustmentPercentage("Pandemic inflation", 20.0));
        }

        return deals;
    }
}