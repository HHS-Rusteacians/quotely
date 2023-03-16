package org.hhsrustaceans.quotely.output;

import org.hhsrustaceans.quotely.quote.Quote;

public interface OutputWriter {
    void write(Quote quote);
}
