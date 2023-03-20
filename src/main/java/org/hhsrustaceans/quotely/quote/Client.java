package org.hhsrustaceans.quotely.quote;

import lombok.Getter;
import lombok.Setter;

public class Client {
    public Client() {
        this.name = "Sample Client Inc.";
    }

    @Getter
    @Setter
    private String name;
}
