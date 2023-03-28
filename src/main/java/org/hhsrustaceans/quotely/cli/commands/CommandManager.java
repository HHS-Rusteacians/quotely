package org.hhsrustaceans.quotely.cli.commands;

import lombok.Getter;
import java.util.List;
import java.util.ArrayList;
import org.hhsrustaceans.quotely.cli.commands.commands.CommandHelp;

public class CommandManager {
    @Getter
    private final List<Command> commands;

    public CommandManager() {
        this.commands = new ArrayList<>();

        Command[] commands = new Command[] {
            new CommandHelp(),
        };

        for (Command command : commands) {
            this.registerCommand(command);
        }
    }

    public void registerCommand(Command command) {
        this.commands.add(command);
    }

    public Command lookupCommand(String name) {
        for (Command command : this.commands) {
            if (command.getName().equals(name)) {
                return command;
            }
        }

        return null;
    }
}