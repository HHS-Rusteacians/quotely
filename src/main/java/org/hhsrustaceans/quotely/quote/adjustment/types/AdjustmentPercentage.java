package org.hhsrustaceans.quotely.quote.adjustment.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

/** A class AdjustmentPercentage that extends the ValueAdjustment class that receives a price argument.
 * @see ValueAdjustment;
 */
public class AdjustmentPercentage extends ValueAdjustment {
    @Getter
    private double percentage;

    public AdjustmentPercentage(String name, double percentage) {
        super(name);
        this.percentage = percentage;
    }

    /**
     * @return the division of the adjustment from the value by 100 and multiplies it with the percentage.
     * @see ValueAdjustment;
     * @Override annotation is used to override the method in the parent class.
     */
    @Override
    public double getAdjustment(double value) {
        return (value / 100) * this.percentage;
    }
}