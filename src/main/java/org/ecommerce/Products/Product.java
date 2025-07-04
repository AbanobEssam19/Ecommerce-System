package org.ecommerce.Products;

import org.ecommerce.ExpiringBehavior.ExpiringBehavior;
import org.ecommerce.ShippingBehavior.ShippingBehavior;

import java.util.Date;

public abstract class Product {
    private ShippingBehavior shippingBehavior;
    private ExpiringBehavior expiringBehavior;

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity, ShippingBehavior shippingBehavior, ExpiringBehavior expiringBehavior) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.shippingBehavior = shippingBehavior;
        this.expiringBehavior = expiringBehavior;
    }

    public String getName() {
        return this.name;
    }

    public int getAvailableQuantity() {
        return this.quantity;
    }

    public void updateAvailableQuantity(int required) {
        this.quantity -= required;
    }

    public double getPrice() {
        return this.price;
    }

    public ShippingBehavior getShippingBehavior() {
        return this.shippingBehavior;
    }

    public boolean hasExpired() {
        boolean isExpiring = expiringBehavior.isExpiring();
        if (!isExpiring)
            return false;
        Date today = new Date();
        return today.after(expiringBehavior.getExpirationDate());
    }

    public boolean isShipping() {
        return shippingBehavior.isShipping();
    }

}
