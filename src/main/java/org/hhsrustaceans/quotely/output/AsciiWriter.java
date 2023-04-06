package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;
import org.hhsrustaceans.quotely.quote.options.Category;
import org.hhsrustaceans.quotely.quote.options.Option;

import java.io.PrintStream;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(PrintStream writer, Quote quote) {
        writer.printf("Quote for %s%n", quote.getClient().getName());
        writer.printf("Created on %s%n", quote.getCreationDate());
        writer.printf("Due for %s%n", quote.getDueDate());

        Object[][] components = quote.getComponents().stream()
                .sorted((a, b) -> {
                    if (a instanceof PriceComponent && b instanceof OptionComponent) {
                        return -1;
                    }
                    if (a instanceof OptionComponent && b instanceof PriceComponent) {
                        return 1;
                    }
                    return 0;
                })
                .map(this::getRow)
                .toArray(Object[][]::new);

        TextTable table = new TextTable(
                new String[]{
                        "Name",
                        String.format("Price (%s)", quote.getCurrency().getSymbol()),
                        "Category"
                },
                components
        );

        table.printTable(writer, 0);

        writer.println();
        writer.printf("Sub total: %.2f%n", quote.getComponents().stream().mapToDouble(
                Component::getValue
        ).sum());
        writer.printf("Total: %.2f%n", quote.getComponents().stream().mapToDouble(
                Component::getAdjustedValue
        ).sum());
    }

    private String formatPrice(double price) {
        return String.format("%.2f", price);
    }

    private Object[] getRow(Component component) {
        String name = component.getName();
        String price = formatPrice(component.getAdjustedValue());
        Category category = null;

        if (component.hasDeduction()) {
            price = String.format("%s (%s)", price, formatPrice(component.getAdjustment()));
        } else if (component.hasIncrease()) {
            price = String.format("%s (+%s)", price, formatPrice(component.getAdjustment()));
        }

        if (component instanceof OptionComponent) {
            name = String.format("+ %s", name);

            Option option = ((OptionComponent) component).getOption();
            category = option.getCategory();

            if (option.isGreen()) {
                name = String.format("%s 🍃", name);
            }
        }

        return new Object[]{
                name,
                price,
                category
        };
    }
}
