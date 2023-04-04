package org.hhsrustaceans.quotely;

import org.hhsrustaceans.quotely.cli.commands.CommandRoot;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        int statusCode = new CommandLine(new CommandRoot()).execute(args);
        System.exit(statusCode);
    }
}
