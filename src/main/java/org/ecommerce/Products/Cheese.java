package org.ecommerce.Products;

import org.ecommerce.ExpiringBehavior.Expirable;
import org.ecommerce.ShippingBehavior.Shippable;

import java.util.Date;

public class Cheese extends Product {
    public Cheese(String name, double price, int quantity, double weight, String date) {
        super(name, price, quantity, new Shippable(weight, name), new Expirable(new Date(date)));
    }
}
