package org.hhsrustaceans.quotely.quote;

import lombok.Getter;

import java.util.List;

public class Quote {
    public Quote(Client client, List<PriceComponent> priceComponents) {
        this.client = client;
        this.priceComponents = priceComponents;
    }

    @Getter
    private Client client;
    
    @Getter
    private List<PriceComponent> priceComponents;
}
