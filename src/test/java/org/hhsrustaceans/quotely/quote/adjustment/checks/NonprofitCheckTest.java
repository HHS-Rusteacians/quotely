package org.hhsrustaceans.quotely.quote.adjustment.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NonprofitCheckTest {
    @Test
    public void testNonprofitEligibility() {
        List<ValueAdjustment> adjustments = new NonprofitCheck().getAdjustments(new Client("Test", ClientType.NONPROFIT));
        Assertions.assertTrue(adjustments.size() > 0);
    }
}
