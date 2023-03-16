package org.hhsrustaceans.quotely.quote;

import lombok.Getter;

public class PriceComponent {
    public PriceComponent(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Getter
    private String name;

    @Getter
    private double value;
}
