import org.hhsrustaceans.quotely.output.OutputWriter;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.quote.Quote;

public class Main {
    public static void main(String[] args) {
        Quote quote = new Quote();
        OutputWriter writer = new AsciiWriter();
        writer.write(quote);
    }
}
