package org.hhsrustaceans.quotely.quote;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.component.Component;

import java.util.List;

public class Quote {
    public Quote(Client client, List<Component> components) {
        this.client = client;
        this.components = components;
    }

    @Getter
    private Client client;
    
    @Getter
    private List<Component> components;
}
