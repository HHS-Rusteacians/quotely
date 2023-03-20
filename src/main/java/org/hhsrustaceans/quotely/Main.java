package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.Option;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;

public class Main {
    public static void main(String[] args) {
        Quote quote = new Quote();

        quote.addComponent(new PriceComponent("Component 1", 1.0));
        quote.addComponent(new PriceComponent("Component 2", 2.0));
        quote.addComponent(new PriceComponent("Component 3", 3.0));
        quote.addComponent(new OptionComponent(new Option("Option 1", 4.0, false)));
        quote.addComponent(new OptionComponent(new Option("Option 2", 5.0, true)));

        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
