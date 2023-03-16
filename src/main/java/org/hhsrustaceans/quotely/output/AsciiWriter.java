package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.Quote;

import java.io.PrintStream;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(PrintStream writer, Quote quote) {
        writer.println(quote.getClient().getName());
        writer.println("Quote");

        TextTable table = new TextTable(
                new String[]{"Name", "Price"},
                quote.getComponents().stream().map(
                        component -> {
                            Object[] row = new Object[]{
                                    component.getName(),
                                    String.format("%.2f", component.getValue())
                            };

                            if(component instanceof OptionComponent) {
                                row[0] = "- " + row[0];
                            }

                            return row;
                        }
                ).toArray(Object[][]::new));

        table.printTable();

        writer.println();
        writer.printf("Total: %.2f", quote.getComponents().stream().mapToDouble(
                Component::getValue
        ).sum());
        writer.println();
    }
}
