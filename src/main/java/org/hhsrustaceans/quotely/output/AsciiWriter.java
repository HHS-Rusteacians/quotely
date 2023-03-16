package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.PriceComponent;
import org.hhsrustaceans.quotely.quote.Quote;

import java.io.PrintStream;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(PrintStream writer, Quote quote) {
        writer.println(quote.getClient().getName());
        writer.println("Quote");

        TextTable table = new TextTable(
                new String[]{"Name", "Price"},
                quote.getPriceComponents().stream().map(
                        component -> new Object[]{component.getName(), String.format("%.2f", component.getValue())}
                ).toArray(Object[][]::new));

        table.printTable();

        writer.println();
        writer.printf("Total: %.2f", quote.getPriceComponents().stream().mapToDouble(
                PriceComponent::getValue
        ).sum());
        writer.println();
    }
}
