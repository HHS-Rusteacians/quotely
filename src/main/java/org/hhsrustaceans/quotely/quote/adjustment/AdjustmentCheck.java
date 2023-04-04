package org.hhsrustaceans.quotely.quote.adjustment;

import org.hhsrustaceans.quotely.quote.client.Client;

import java.util.List;

public interface AdjustmentCheck {
    List<ValueAdjustment> getAdjustments(Client client);
}
