package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.client.ClientType;
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
        Category essentials = new Category("essentials", "Essentials");
        DealManager dealManager = new DealManager();

        quote.addComponent(new PriceComponent("Component 1", 1.0));
        quote.addComponent(new PriceComponent("Component 2", 2.0));

        Component testComponent = new PriceComponent("Component 3", 3.0);
        dealManager.applyDeals(testComponent);
        quote.addComponent(testComponent);

        quote.addComponent(new OptionComponent(new Option("Option 1", 4.0, essentials)));
        quote.addComponent(new OptionComponent(new Option("Option 2", 5.0, essentials, true)));

        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
