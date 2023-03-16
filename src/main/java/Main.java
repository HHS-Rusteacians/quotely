import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.Client;
import org.hhsrustaceans.quotely.quote.PriceComponent;
import org.hhsrustaceans.quotely.quote.Quote;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sample Client Inc.");

        ArrayList<PriceComponent> components = new ArrayList<>();
        components.add(new PriceComponent("Component 1", 1.0));
        components.add(new PriceComponent("Component 2", 2.0));
        components.add(new PriceComponent("Component 3", 3.0));

        Quote quote = new Quote(client, components);
        OutputWriter writer = new AsciiWriter();
        writer.write(quote);
    }
}
