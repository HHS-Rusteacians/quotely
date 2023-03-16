package org.hhsrustaceans.quotely.quote;

import lombok.Getter;

public class Option {
    public Option(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Getter
    private String name;

    @Getter
    private double price;
}
