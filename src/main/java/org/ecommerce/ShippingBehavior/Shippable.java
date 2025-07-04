package org.ecommerce.ShippingBehavior;

public class Shippable implements ShippingBehavior {
    private double weight;
    private String name;
    public Shippable(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    public double getWeight() {
        return this.weight;
    }

    public boolean isShipping() {
        return true;
    }

    public String getName() {
        return this.name;
    }
}