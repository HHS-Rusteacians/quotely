package org.hhsrustaceans.quotely.quote;

import lombok.Getter;

public class Client {
    public Client(String name) {
        this.name = name;
    }

    @Getter
    private String name;
}
