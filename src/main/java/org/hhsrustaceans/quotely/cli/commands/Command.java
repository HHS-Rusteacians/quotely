package org.hhsrustaceans.quotely.cli.commands;

import lombok.Getter;

public abstract class Command {
    @Getter
    private String name;

    @Getter
    private String syntax;

    public Command(String name) {
        this.name = name;
    }

    public Command(String name, String syntax) {
        this(name);
        this.syntax = syntax;
    }

    public abstract void execute(String[] args);
}