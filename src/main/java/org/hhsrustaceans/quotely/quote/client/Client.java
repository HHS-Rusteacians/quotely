package org.hhsrustaceans.quotely.quote.client;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    @Setter
    private String name;
    private ClientType client_type;

    public Client() {
        this.name = "Buy&Large";
        this.client_type = ClientType.BUSINESS;
    }

    public Client(String name, ClientType client_type) {
        this.name = name;
        this.client_type = client_type;
    }
}
