package org.hhsrustaceans.quotely.quote;

import lombok.Getter;

public class Option {
    public Option(String name, double price, boolean isGreen) {
        this.name = name;
        this.price = price;
        this.isGreen = isGreen;
    }

    @Getter
    private String name;

    @Getter
    private double price;

    @Getter
    private boolean isGreen;
}
