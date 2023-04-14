package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.Quote;
import java.util.List;

public interface AdjustmentCheck {
    /**
     * @param quote The quote to check for adjustments.
     */
    List<ValueAdjustment> getAdjustments(Quote quote);
}