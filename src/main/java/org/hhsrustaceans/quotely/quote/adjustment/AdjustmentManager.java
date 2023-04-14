package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.adjustment.checks.*;

import java.util.ArrayList;
import java.util.List;

// A class that receives a quote and a List of AdjustmentCheck and returns a list of ValueAdjustments.
public class AdjustmentManager {
    private Quote quote;

    private List<AdjustmentCheck> checks;

    public AdjustmentManager(Quote quote) {
        this.quote = quote;
        this.checks = new ArrayList<>();
        this.checks.add(new NonprofitCheck());
        this.checks.add(new RandomCheck());
    }

    /**
     * A method that contains a loop through the AdjustmentChecks and returns a list of ValueAdjustments.
     * @return adjustments.
     * @see Quote;
     * @see Component;
     * @see ValueAdjustment;
     */
    public List<ValueAdjustment> getAdjustments() {
        List<ValueAdjustment> adjustments = new ArrayList<>();

        // Check customer adjustments
        for (AdjustmentCheck check: checks) {
            adjustments.addAll(check.getAdjustments(quote));
        }

        return adjustments;
    }

    /**
     * A method that applies the adjustments to the component.
     * @param component Component to apply adjustments to.
     */
    public void applyAdjustments(Component component) {
        component.addDeals(getAdjustments());
    }
}