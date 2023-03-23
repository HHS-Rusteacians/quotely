package org.hhsrustaceans.quotely.quote.options;

import lombok.Getter;

public class Category {
    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Getter
    private String id;

    @Getter
    private String name;

    @Override
    public String toString() {
        return this.name;
    }
}
