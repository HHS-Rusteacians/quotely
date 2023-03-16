package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;
import org.hhsrustaceans.quotely.quote.Quote;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write(Quote quote) {
        System.out.println("Client name");
        System.out.println("Quote");
        TextTable table = new TextTable(new String[]{"Name", "Price"}, new Object[][]{});
        table.printTable();
    }
}
