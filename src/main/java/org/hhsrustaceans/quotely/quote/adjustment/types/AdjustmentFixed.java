package org.hhsrustaceans.quotely.quote.adjustment.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

public class AdjustmentFixed extends ValueAdjustment {
    @Getter
    private double value;

    public AdjustmentFixed(String name, double value) {
        super(name);
        this.value = value;
    }

    @Override
    public double getAdjustment(double value) {
        return this.value;
    }
}
