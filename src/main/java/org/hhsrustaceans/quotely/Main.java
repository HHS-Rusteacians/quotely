package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.Client;
import org.hhsrustaceans.quotely.quote.Option;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sample Client Inc.");
        Currency currency = Currency.getInstance("EUR");

        ArrayList<Component> components = new ArrayList<>();
        components.add(new PriceComponent("Component 1", 1.0));
        components.add(new PriceComponent("Component 2", 2.0));
        components.add(new PriceComponent("Component 3", 3.0));
        components.add(new OptionComponent(new Option("Option 1", 4.0, false)));
        components.add(new OptionComponent(new Option("Option 2", 5.0, true)));

        Date creationDate = Date.from(Instant.now());
        Date dueDate = Date.from(Instant.now().plus(14, ChronoUnit.DAYS));

        Quote quote = new Quote(client, creationDate, dueDate, components, currency);
        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
