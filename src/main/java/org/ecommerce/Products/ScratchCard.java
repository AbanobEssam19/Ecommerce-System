package org.ecommerce.Products;

import org.ecommerce.ExpiringBehavior.NotExpirable;
import org.ecommerce.ShippingBehavior.NotShippable;

public class ScratchCard extends Product {
    public ScratchCard(String name, double price, int quantity) {
        super(name, price, quantity, new NotShippable(), new NotExpirable());
    }
}
