package org.hhsrustaceans.quotely.quote.deals.types;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.deals.Deal;

public class DealFixed extends Deal {
    @Getter
    private double value;

    public DealFixed(String name, double value) {
        super(name);
        this.value = value;
    }

    @Override
    public double getDeduction(double value) {
        return value - this.value;
    }
}
