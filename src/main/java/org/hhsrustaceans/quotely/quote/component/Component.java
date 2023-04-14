package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.adjustment.ValueAdjustment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A component is a part of a quote that can be adjusted by a deal.
 * For example, a component could be a part of a quote that is a
 * "door" and a deal could be a "discount" that reduces the value
 * of the door.
 */
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

    /**
     * Get the total adjustment of all deals applied to this component.
     * @return The total adjustment.
     */
    public double getAdjustment() {
        double total_adjustment = 0.0;

        // Get the adjustment for each deal and add it to the total.
        for (ValueAdjustment adjustment: this.deals) {
            total_adjustment += adjustment.getAdjustment(this.value);
        }

        return total_adjustment;
    }

    /**
     * Get the adjusted value of this component.
     * @return The adjusted value.
     */
    public double getAdjustedValue() {
        return this.value + this.getAdjustment();
    }

    /**
     * Get the total value of this component, including all deals.
     * @return The total value.
     */
    public boolean hasDeduction() {
        return this.getAdjustment() < 0.0;
    }

    /**
     * Get the total value of this component, including all deals.
     * @return The total value.
     */
    public boolean hasIncrease() {
        return this.getAdjustment() > 0.0;
    }

    /**
     * Add a deal to this component.
     * @param adjustment The deal to add.
     * @return The component.
     */
    public void addDeals(List<ValueAdjustment> adjustments) {
        this.deals.addAll(adjustments);
    }

    @Getter
    private List<ValueAdjustment> deals;
}
