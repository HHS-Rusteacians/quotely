package org.hhsrustaceans.quotely.quote.client;

import lombok.Getter;
import lombok.Setter;
/**
 * Client class which represents a client of the company.
 */
public class Client {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private ClientType type;

    public Client() {
        this.name = "Buy&Large";
        this.type = ClientType.BUSINESS;
    }

    public Client(String name, ClientType type) {
        this.name = name;
        this.type = type;
    }
}
