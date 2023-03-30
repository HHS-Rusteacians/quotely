package org.hhsrustaceans.quotely.quote.deals.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DealFixedTest {
    @Test
    public void testFixedDeduction() {
        DealFixed fixed = new DealFixed("Fixed", 10.0);
        Assertions.assertEquals(5.0, fixed.getDeduction(15.0));
    }
}
