package org.hhsrustaceans.quotely.cli.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Spec;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.ParameterException;

@Command(
    name = "quotely",
    description = "A simple and efficient quotation generation system that scales.",
    mixinStandardHelpOptions = true,
    synopsisSubcommandLabel = "<COMMAND>",
    subcommands = {
        CommandGenerate.class
    }
)
public class CommandRoot implements Runnable {
    @Spec CommandSpec spec;

    @Override
    public void run() {
        throw new ParameterException(spec.commandLine(), "Missing required subcommand");
    }
}
