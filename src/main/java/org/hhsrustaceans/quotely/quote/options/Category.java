package org.hhsrustaceans.quotely.quote.options;

import lombok.Getter;
import lombok.Setter;
import picocli.CommandLine;

public class Category {
    // Default fallback option
    public Category() { }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Getter
    @Setter
    @CommandLine.Option(names = "--category-id", description = "The id of the category", required = true)
    private String id;

    @Getter
    @Setter
    @CommandLine.Option(names = "--category-name", description = "The name of the category", required = true)
    private String name;

    @Override
    public String toString() {
        return this.name;
    }
}
