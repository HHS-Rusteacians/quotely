package org.hhsrustaceans.quotely.cli.commands;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(
    name = "quotely",
    description = "A simple and efficient quotation generation system that scales.",
    mixinStandardHelpOptions = true,
    subcommands = {
        CommandGenerate.class
    }
)
public class CommandRoot implements Callable<Integer> {
    @Override
    public Integer call() {
        System.err.println("No command specified.");
        return 1;
    }
}
