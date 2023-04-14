package org.hhsrustaceans.quotely.quote.options;

import lombok.Getter;
import lombok.Setter;
import picocli.CommandLine;

/**
 * Represents a category of quotes
 */
public class Category {
    // Default fallback option
    public Category() { }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * The id of the category
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "--category-id", description = "The id of the category", required = true)
    private String id;

    /**
     * The name of the category
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "--category-name", description = "The name of the category", required = true)
    private String name;

    /**
     * The description of the category
     */
    @Override
    public String toString() {
        return this.name;
    }
}
