package org.hhsrustaceans.quotely.quote.adjustment.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdjustmentPercentageTest {
//    Checken of de juiste kortingspercentage wordt berekend

    @Test
    public void testGetDeduction() {
        AdjustmentPercentage adjustmentPercentage = new AdjustmentPercentage("comp1", 10);

        Assertions.assertEquals(10, adjustmentPercentage.getAdjustment(100));
    }
}
