package org.hhsrustaceans.quotely.cli;

import java.util.Scanner;
import java.io.InputStream;

public class LineReader {
    private Scanner scanner;

    public LineReader(InputStream input) {
        this.scanner = new Scanner(input);
    }
}
