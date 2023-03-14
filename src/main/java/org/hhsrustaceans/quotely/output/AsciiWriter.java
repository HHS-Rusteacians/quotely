package org.hhsrustaceans.quotely.output;

import dnl.utils.text.table.TextTable;

public class AsciiWriter implements OutputWriter {
    @Override
    public void write() {
        System.out.println("Client name");
        System.out.println("Quote");
        TextTable table = new TextTable(new String[]{"Name", "Price"}, new Object[][]{});
        table.printTable();
    }
}
