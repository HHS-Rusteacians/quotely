package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.adjustment.checks.*;

import java.util.ArrayList;
import java.util.List;

public class AdjustmentManager {
    private Quote quote;

    private List<AdjustmentCheck> checks;

    public AdjustmentManager(Quote quote) {
        this.quote = quote;
        this.checks = new ArrayList<>();
        this.checks.add(new NonprofitCheck());
        this.checks.add(new RandomCheck());
    }

    public List<ValueAdjustment> getAdjustments() {
        List<ValueAdjustment> adjustments = new ArrayList<>();

        // Check customer adjustments
        for (AdjustmentCheck check: checks) {
            adjustments.addAll(check.getAdjustments(quote.getClient()));
        }

        return adjustments;
    }

    public void applyAdjustments(Component component) {
        component.addDeals(getAdjustments());
    }
}