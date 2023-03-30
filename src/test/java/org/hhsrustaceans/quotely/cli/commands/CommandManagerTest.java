package org.hhsrustaceans.quotely.cli.commands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CommandManagerTest {

    @Test
    public void testLookupCommand() {

        Assertions.assertNotNull(new CommandManager().lookupCommand("help"));

    }
}
