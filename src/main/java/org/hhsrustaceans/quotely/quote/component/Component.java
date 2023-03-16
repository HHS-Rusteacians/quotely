package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;

public abstract class Component {
    public Component(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Getter
    private String name;

    @Getter
    private double value;
}
