package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.deals.DealManager;
import org.hhsrustaceans.quotely.quote.options.Category;
import org.hhsrustaceans.quotely.quote.options.Option;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;

public class Main {
    public static void main(String[] args) {
        Quote quote = new Quote();
        Category essentials = new Category("peripherals", "Peripherals");
        DealManager dealManager = new DealManager(quote.getClient());

        quote.addComponent(new PriceComponent("Omhulsing", 20000.0));
        quote.addComponent(new PriceComponent("Motor", 3000.0));

        Component testComponent = new PriceComponent("Keuken", 2000.0);
        dealManager.applyDeals(testComponent);
        quote.addComponent(testComponent);

        quote.addComponent(new OptionComponent(new Option("Koelkast", 1200.0, essentials)));
        quote.addComponent(new OptionComponent(new Option("Vaatwasser", 800.0, essentials, true)));

        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
