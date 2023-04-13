package org.hhsrustaceans.quotely.output;
import org.hhsrustaceans.quotely.quote.Quote;
import org.hhsrustaceans.quotely.quote.component.Component;
import org.hhsrustaceans.quotely.quote.component.PriceComponent;
import org.hhsrustaceans.quotely.output.AsciiWriter;
import org.hhsrustaceans.quotely.cli.commands.CommandGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAsciiWriter {
    @Test
    public void testAsciiWriter() {
        OutputWriter writer = new AsciiWriter();
        Quote quote = new Quote();
        writer.write(System.out, quote);
        Assertions.assertDoesNotThrow(() -> writer.write(System.out, quote));
    }
    @Test
    public void testFormatPrice(){
        AsciiWriter writer = new AsciiWriter();
        double price = 10.1234;
        String formattedPrice = writer.formatPrice(price);
        Assertions.assertEquals("10,12", formattedPrice);
    }

}