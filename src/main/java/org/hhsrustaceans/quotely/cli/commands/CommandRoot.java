package org.hhsrustaceans.quotely.cli.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Spec;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.ParameterException;

/**
 * Creates a command that is used to generate a quote.
 *
 * It contains 5 arguments that is used for setting the quote value for the client.
 * @Command annotation is used to create a command that is used to generate a quote.
 * name = "quotely" is used to set the name of the command.
 * description = "A simple and efficient quotation generation system that scales." is used to set the description of the command.
 * mixinStandardHelpOptions = true is used to set the help option.
 * synopsisSubcommandLabel = "<COMMAND>" is used to set the subcommand label.
 * subcommands = { CommandGenerate.class } is used to set the subcommands.
 * @see picocli.CommandLine.Command;
 */
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
    /**
     * @Spec CommandSpec spec;
     * It is used to set the command specification.
     * @see picocli.CommandLine.Spec;
     */
    @Spec CommandSpec spec;

    /**
     * @Override annotation is used to override the run method.
     * @throws ParameterException if the subcommand is missing.
     * It contains a throw statement that throws an exception if the subcommand is missing.
     */
    @Override
    public void run() {
        throw new ParameterException(spec.commandLine(), "Missing required subcommand");
    }
}