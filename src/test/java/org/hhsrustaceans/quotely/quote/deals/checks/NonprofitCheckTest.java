package org.hhsrustaceans.quotely.quote.deals.checks;

import org.hhsrustaceans.quotely.quote.client.Client;
import org.hhsrustaceans.quotely.quote.client.ClientType;
import org.hhsrustaceans.quotely.quote.deals.Deal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NonprofitCheckTest {

    @Test
    public void testNonprofitEligibility() {

        List<Deal> deals = new NonprofitCheck().getDeals(new Client("Test", ClientType.NONPROFIT));

        Assertions.assertTrue(deals.size() > 0);

    }


}
