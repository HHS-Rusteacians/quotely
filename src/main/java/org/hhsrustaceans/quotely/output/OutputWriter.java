package org.hhsrustaceans.quotely.output;

import org.hhsrustaceans.quotely.quote.Quote;
import java.io.PrintStream;

/**
 * Interface for output writers.
 * @since 1.0
 */
public interface OutputWriter {
    void write(PrintStream writer, Quote quote);
}