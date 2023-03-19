package org.hhsrustaceans.quotely.quote;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.component.Component;

import java.util.Date;
import java.util.List;

public class Quote {
    public Quote(Client client, Date creationDate, Date dueDate, List<Component> components) {
        this.client = client;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.components = components;
    }

    @Getter
    private Client client;

    @Getter
    private Date creationDate;

    @Getter
    private Date dueDate;

    @Getter
    private List<Component> components;
}
