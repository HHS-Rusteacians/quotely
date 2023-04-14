package org.hhsrustaceans.quotely.quote.adjustment;

import lombok.Getter;

/**
 * A class ValueAdjustment that receives a name argument.
 */
public abstract class ValueAdjustment {
    @Getter
    private String name;

    /**
     * @param name of the adjustment.
     * Set the name of the value adjustment.
     */
    public ValueAdjustment(String name) {
        this.name = name;
    }

    public abstract double getAdjustment(double value);
}