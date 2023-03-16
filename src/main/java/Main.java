import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.*;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.OptionComponent;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sample Client Inc.");

        ArrayList<Component> components = new ArrayList<>();
        components.add(new PriceComponent("Component 1", 1.0));
        components.add(new PriceComponent("Component 2", 2.0));
        components.add(new PriceComponent("Component 3", 3.0));
        components.add(new OptionComponent(new Option("Option 1", 4.0)));

        Quote quote = new Quote(client, components);
        OutputWriter writer = new AsciiWriter();
        writer.write(System.out, quote);
    }
}
