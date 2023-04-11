package org.hhsrustaceans.quotely.quote.adjustment.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdjustmentFixedTest {

//    Checken of de waarde van de AdjustmentFixed gelijk is aan de waarde die je hebt meegegeven
    @Test
    public void testFixedDeduction() {
        AdjustmentFixed fixed = new AdjustmentFixed("Fixed", 10.0);
        Assertions.assertEquals(5.0, fixed.getAdjustment(15.0));
    }
}
