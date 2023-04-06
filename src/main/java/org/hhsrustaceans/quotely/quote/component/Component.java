package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

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

    public double getAdjustment() {
        double total_adjustment = 0.0;

        for (ValueAdjustment adjustment: this.deals) {
            total_adjustment += adjustment.getAdjustment(this.value);
        }

        return total_adjustment;
    }

    public double getAdjustedValue() {
        return this.value + this.getAdjustment();
    }

    public boolean hasDeduction() {
        return this.getAdjustment() < 0.0;
    }

    public boolean hasIncrease() {
        return this.getAdjustment() > 0.0;
    }

    public void addDeals(List<ValueAdjustment> adjustments) {
        this.deals.addAll(adjustments);
    }

    @Getter
    private List<ValueAdjustment> deals;
}
