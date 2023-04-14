package org.hhsrustaceans.quotely.quote.options;

import lombok.Getter;
import lombok.Setter;
import org.hhsrustaceans.quotely.cli.converters.CategoryConverter;
import picocli.CommandLine;

/**
 * Represents an option for a quote.
 */
public class Option {
    // Default fallback option
    public Option() { }

    public Option(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Option(String name, double price, Category category) {
        this(name, price);
        this.category = category;
    }

    public Option(String name, double price, Category category, boolean isGreen) {
        this(name, price, category);
        this.isGreen = isGreen;
    }

    /**
     * The name of the option.
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "-o", description = "The name of the option", required = true)
    private String name;

    /**
     * The price of the option.
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "-p", description = "The price of the option", required = true)
    private double price;

    /**
     * The category of the option.
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "-c", description = "The category of the option", converter = CategoryConverter.class)
    private Category category;

    /**
     * Whether the option is environmentally friendly.
     */
    @Getter
    @Setter
    @CommandLine.Option(names = "--green", description = "Option is environmentally friendly")
    private boolean isGreen;
}
