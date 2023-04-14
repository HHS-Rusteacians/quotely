package org.hhsrustaceans.quotely.quote;

import lombok.Getter;
import lombok.Setter;
import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.component.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * Represents a quote for the client. It has a client, creation date, a due date, a list of components, and a currency.
 * Everything is mutable except the components list. But all automaticly generated getters and setters are included.
 */
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

    /**
     * Adds a component to the quote.
     * @param component The component to add.
     */
    public void addComponent(Component component) {
        this.components.add(component);
    }

    /**
     * Removes a component from the quote. Sadly the function is not called in the code.
     * So right now it is not possible to remove a component from the quote. With the current implementation.
     * @param component The component to remove.
     */
    public void removeComponent(Component component){
        this.components.remove(component);
    }
}
