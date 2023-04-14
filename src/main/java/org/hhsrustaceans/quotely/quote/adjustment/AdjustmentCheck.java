package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.Quote;
import java.util.List;

/**
 * An interface that receives a quote and returns a list of ValueAdjustments.
 * @see Quote;
 * @see ValueAdjustment;
 */
public interface AdjustmentCheck {
    /**
     * @param quote The quote to check for adjustments.
     */
    List<ValueAdjustment> getAdjustments(Quote quote);
}