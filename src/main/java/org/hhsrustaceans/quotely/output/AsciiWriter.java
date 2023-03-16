package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;

import java.io.PrintStream;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(PrintStream writer, Quote quote) {
        writer.println(quote.getClient().getName());
        writer.println("Quote");

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
                new String[]{"Name", "Price"},
                components
        );

        table.printTable(writer, 0);

        writer.println();
        writer.printf("Total: %.2f", quote.getComponents().stream().mapToDouble(
                Component::getValue
        ).sum());
        writer.println();
    }

    private Object[] getRow(Component component) {
        String name = component.getName();

        if (component instanceof OptionComponent) {
            name = String.format("+ %s", name);

            if (((OptionComponent) component).getOption().isGreen()) {
                name = String.format("%s 🍃", name);
            }
        }

        return new Object[]{
                name,
                String.format("%.2f", component.getValue())
        };
    }
}
