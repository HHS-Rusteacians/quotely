package org.hhsrustaceans.quotely.quote.deals.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.deals.Deal;

public class DealPercentage extends Deal {
    @Getter
    private double percentage;

    public DealPercentage(String name, double percentage) {
        super(name);
        this.percentage = percentage;
    }

    @Override
    public double getDeduction(double value) {
        return (value / 100) * this.percentage;
    }
}
