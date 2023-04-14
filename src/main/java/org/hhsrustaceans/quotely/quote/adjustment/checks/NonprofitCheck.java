package org.hhsrustaceans.quotely.quote.adjustment.checks;

import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;
import org.hhsrustaceans.quotely.quote.adjustment.AdjustmentCheck;
import org.hhsrustaceans.quotely.quote.adjustment.types.AdjustmentPercentage;

import java.util.ArrayList;
import java.util.List;

// A class NonprofitCheck that checks if there is a nonprofit discount to apply.
public class NonprofitCheck implements AdjustmentCheck {
    /**
     * Checks if there is a nonprofit discount to apply.
     * @param quote The quote argument.
     * @return A list of ValueAdjustments to apply to the quote.
     * @see ValueAdjustment;
     */
    public List<ValueAdjustment> getAdjustments(Quote quote) {
        List<ValueAdjustment> deals = new ArrayList<>();

        if (quote.getClient().getType().equals(ClientType.NONPROFIT)) {
            deals.add(new AdjustmentPercentage("Nonprofit discount", -10.0));
        }

        return deals;
    }
}