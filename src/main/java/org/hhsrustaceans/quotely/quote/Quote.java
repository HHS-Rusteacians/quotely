package org.hhsrustaceans.quotely.quote;

import lombok.Getter;
import lombok.Setter;
import org.hhsrustaceans.quotely.quote.component.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Quote {
    public Quote() {
        this.client = new Client();
        this.creationDate = Date.from(Instant.now());
        this.dueDate = Date.from(Instant.now().plus(14, ChronoUnit.DAYS));
        this.components = new ArrayList<>();
        this.currency = Currency.getInstance(Locale.getDefault());
    }

    @Getter
    @Setter
    private Client client;

    @Getter
    @Setter
    private Date creationDate;

    @Getter
    @Setter
    private Date dueDate;

    @Getter
    private List<Component> components;

    @Getter
    @Setter
    private Currency currency;

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
