package org.hhsrustaceans.quotely.quote.deals;

import lombok.Getter;

public abstract class Deal {
    @Getter
    private String name;

    public Deal(String name) {
        this.name = name;
    }

    public abstract double getDeduction(double value);
}