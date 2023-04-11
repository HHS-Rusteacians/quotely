package org.hhsrustaceans.quotely.quote.adjustment.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

public class AdjustmentFixed extends ValueAdjustment {
    @Getter
    private double adjustment;

    public AdjustmentFixed(String name, double adjustment) {
        super(name);
        this.adjustment = adjustment;
    }

    @Override
    public double getAdjustment(double value) {
        return value - this.adjustment;
    }
}
