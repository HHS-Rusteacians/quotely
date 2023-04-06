package org.hhsrustaceans.quotely.quote.adjustment.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

public class AdjustmentPercentage extends ValueAdjustment {
    @Getter
    private double percentage;

    public AdjustmentPercentage(String name, double percentage) {
        super(name);
        this.percentage = percentage;
    }

    @Override
    public double getAdjustment(double value) {
        return (value / 100) * this.percentage;
    }
}
