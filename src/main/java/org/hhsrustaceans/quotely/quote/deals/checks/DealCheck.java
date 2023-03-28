package org.hhsrustaceans.quotely.quote.deals.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.deals.Deal;

import java.util.List;

public interface DealCheck {
    List<Deal> getDeals(Client client);
}
