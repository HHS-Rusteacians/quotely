package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.cli.commands.CommandRoot;
import picocli.CommandLine;

public class Main {
    /**
     * Main entry point for the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.exit(new CommandLine(new CommandRoot()).execute(args));
    }
}
