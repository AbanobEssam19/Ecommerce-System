package org.ecommerce.ShippingBehavior;

public class NotShippable implements ShippingBehavior {
    public double getWeight() {
        return 0;
    }

    public boolean isShipping() {
        return false;
    }

    public String getName() {
        return null;
    }
}
