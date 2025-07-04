package org.ecommerce.Products;

import org.ecommerce.ExpiringBehavior.NotExpirable;
import org.ecommerce.ShippingBehavior.Shippable;

public class TV extends Product {
    public TV(String name, double price, int quantity, double weight) {
        super(name, price, quantity, new Shippable(weight, name), new NotExpirable());
    }
}
