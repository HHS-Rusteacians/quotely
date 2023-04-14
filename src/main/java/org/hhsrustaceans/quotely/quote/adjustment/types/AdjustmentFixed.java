package org.hhsrustaceans.quotely.quote.adjustment.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

/**
 * A class AdjustmentFixed that extends the ValueAdjustment class that receives a price argument.
 */
public class AdjustmentFixed extends ValueAdjustment {
    @Getter
    private double adjustment;

    public AdjustmentFixed(String name, double adjustment) {
        super(name);
        this.adjustment = adjustment;
    }

    /**
     * @return the subtraction of the adjustment from the value.
     * @see ValueAdjustment;
     * @Override annotation is used to override the method in the parent class.
     */
    @Override
    public double getAdjustment(double value) {
        return value - this.adjustment;
    }
}