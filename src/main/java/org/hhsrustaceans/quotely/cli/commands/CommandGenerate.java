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

@Command(name = "generate", description = "Generate a quote.")
public class CommandGenerate implements Runnable {
    @CommandLine.Option(names = "-N", description = "The name of the client.", required = true)
    private String clientName;

    @CommandLine.Option(names = "--currency", description = "The currency to use for the quote.")
    private Currency currency;

    @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
    private List<Category> categories;

    @CommandLine.ArgGroup(exclusive = false, multiplicity = "0..*")
    private List<Option> options;

    public CommandGenerate() {
        this.categories = new ArrayList<>();
        this.options = new ArrayList<>();
    }

    @Override
    public void run() {
        Quote quote = new Quote();
        quote.getClient().setName(clientName);

        if (currency != null) {
            quote.setCurrency(currency);
        }

        for (Option option : options) {
            if (option.getCategory() != null) {
                Category foundCategory = categories.stream()
                        .filter(c -> c.getId().equals(option.getCategory().getId()))
                        .findFirst()
                        .orElse(option.getCategory());

                option.setCategory(foundCategory);
            }
            quote.addComponent(new OptionComponent(option));
        }

        AdjustmentManager adjustmentManager = new AdjustmentManager(quote.getClient());
        for (Component component : quote.getComponents()) {
            adjustmentManager.applyAdjustments(component);
        }

        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
