package org.hhsrustaceans.quotely.cli.commands.commands;

import org.hhsrustaceans.quotely.cli.commands.Command;

public class CommandHelp extends Command {
    public CommandHelp() {
        super("help");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("Help");
    }
}