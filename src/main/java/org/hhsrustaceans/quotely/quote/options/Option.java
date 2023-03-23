package org.hhsrustaceans.quotely.quote.options;

import lombok.Getter;

public class Option {
    public Option(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Option(String name, double price, Category category, boolean isGreen) {
        this(name, price, category);
        this.isGreen = isGreen;
    }

    @Getter
    private String name;

    @Getter
    private double price;

    @Getter
    private Category category;

    @Getter
    private boolean isGreen;
}
