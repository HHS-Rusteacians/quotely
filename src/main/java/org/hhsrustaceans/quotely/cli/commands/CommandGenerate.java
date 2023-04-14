package org.hhsrustaceans.quotely.cli.commands;

import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.adjustment.AdjustmentManager;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.options.Category;
import org.hhsrustaceans.quotely.quote.options.Option;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Creates a command that generates a quote.
 * @Command(name = "generate", description = "Generate a quote.")
 * @see picocli.CommandLine.Command;
 * It contains 2 arguments that is used for setting the quote value.
 */
@Command(name = "generate", description = "Generate a quote.")
public class CommandGenerate implements Runnable {

    /**
     * @CommandLine.Option(names = "-N", description = "The name of the client.", required = true)
     * @see picocli.CommandLine.Option;
     * It is used for setting the name of the client.
     */
    @CommandLine.Option(names = "-N", description = "The name of the client.", required = true)
    private String clientName;

    /**
     * @CommandLine.Option(names = "--currency", description = "The currency to use for the quote.")
     * @see picocli.CommandLine.Option;
     * It is used for setting the currency of the quote.
     */
    @CommandLine.Option(names = "--currency", description = "The currency to use for the quote.")
    private Currency currency;

    /**
     * @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
     * @see picocli.CommandLine.ArgGroup;
     * It is used for setting the category of the quote.
     */
    @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
    private List<Category> categories;

    /**
     * @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
     * @see picocli.CommandLine.ArgGroup;
     * It is used for setting the options of the quote.
     */
    @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
    private List<Option> options;

    public CommandGenerate() {
        this.categories = new ArrayList<>();
        this.options = new ArrayList<>();
    }

    /**
     * Creates a quote and sets the client name, currency and options.
     * @Override annotation is used to override the run method.
     * It contains a for loop that is used for setting the category of the quote.
     */
    @Override
    public void run() {
        Quote quote = new Quote();
        quote.getClient().setName(clientName);

        if (currency != null) {
            quote.setCurrency(currency);
        }

        // A for loop that iterates through the options and checks if the category is not null.
        // If the category is not null, it will set the category of the option.
        // Then there is a Category stream that will filter the categories and find the first category.
        for (Option option : options) {
            if (option.getCategory() != null) {
                Category foundCategory = categories.stream()
                        .filter(c -> c.getId().equals(option.getCategory().getId()))
                        .findFirst()
                        .orElse(option.getCategory());

                option.setCategory(foundCategory);
            }

            // It will add the option to the quote.
            quote.addComponent(new OptionComponent(option));
        }

        AdjustmentManager adjustmentManager = new AdjustmentManager(quote);

        for (Component component : quote.getComponents()) {
            adjustmentManager.applyAdjustments(component);
        }

        // It will create a new AsciiWriter and write the quote to the console.
        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}