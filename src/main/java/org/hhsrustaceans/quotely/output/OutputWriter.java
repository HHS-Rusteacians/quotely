package org.hhsrustaceans.quotely.output;

import org.hhsrustaceans.quotely.quote.Quote;

import java.io.PrintStream;

public interface OutputWriter {
    void write(PrintStream writer, Quote quote);
}
