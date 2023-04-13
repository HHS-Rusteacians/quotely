package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.Quote;

import java.util.List;

public interface AdjustmentCheck {
    List<ValueAdjustment> getAdjustments(Quote quote);
}
