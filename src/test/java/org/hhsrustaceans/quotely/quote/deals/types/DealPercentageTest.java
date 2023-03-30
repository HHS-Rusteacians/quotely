package org.hhsrustaceans.quotely.quote.deals.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DealPercentageTest {

    @Test
    public void testGetDeduction() {
        DealPercentage dealPercentage = new DealPercentage("comp1", 10);

        Assertions.assertEquals(10, dealPercentage.getDeduction(100));
    }
}
