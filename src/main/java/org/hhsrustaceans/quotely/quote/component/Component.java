package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.deals.Deal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Component {
    public Component(String name, double value) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.value = value;
        this.deals = new ArrayList<>();
    }

    @Getter
    private UUID id;

    @Getter
    private String name;

    @Getter
    private double value;

    private double getDeduction() {
        double deduction = 0.0;

        for (Deal deal: this.deals) {
            deduction += deal.getDeduction(this.value);
        }

        return deduction;
    }

    public double getDeductedValue() {
        return this.value - this.getDeduction();
    }

    public boolean hasDeduction() {
        return this.getDeduction() > 0.0;
    }

    public void addDeals(List<Deal> deals) {
        this.deals.addAll(deals);
    }

    @Getter
    private List<Deal> deals;
}
