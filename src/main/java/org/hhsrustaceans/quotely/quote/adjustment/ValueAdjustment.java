package org.hhsrustaceans.quotely.quote.adjustment;

import lombok.Getter;

public abstract class ValueAdjustment {
    @Getter
    private String name;

    public ValueAdjustment(String name) {
        this.name = name;
    }

    public abstract double getAdjustment(double value);
}