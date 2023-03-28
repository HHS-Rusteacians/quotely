package org.hhsrustaceans.quotely.quote.deals;

import org.hhsrustaceans.quotely.quote.client.Client;

import java.util.List;

public interface DealCheck {
    List<Deal> getDeals(Client client);
}
