package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.PriceComponent;
import org.hhsrustaceans.quotely.quote.Quote;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(Quote quote) {
        System.out.println(quote.getClient().getName());
        System.out.println("Quote");

        TextTable table = new TextTable(
                new String[]{"Name", "Price"},
                quote.getPriceComponents().stream().map(
                        component -> new Object[]{component.getName(), String.format("%.2f", component.getValue())}
                ).toArray(Object[][]::new));

        table.printTable();

        System.out.println();
        System.out.printf("Total: %.2f", quote.getPriceComponents().stream().mapToDouble(
                PriceComponent::getValue
        ).sum());
        System.out.println();
    }
}
