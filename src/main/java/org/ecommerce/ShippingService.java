package org.ecommerce;

import org.ecommerce.Products.Product;
import org.ecommerce.ShippingBehavior.ShippingBehavior;

import java.util.ArrayList;
import java.util.List;

public class ShippingService {

    private class ShippingItem {
        private ShippingBehavior product;
        private int quantity;

        public ShippingItem(ShippingBehavior product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }
    private List<ShippingItem> products;

    public ShippingService() {
        this.products = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        products.add(new ShippingItem(product.getShippingBehavior(), quantity));
    }

    public void ShipItems() {
        if (products.isEmpty())
            return;
        System.out.println("** Shipment notice **");
        double total = 0;
        for (ShippingItem item : products) {
            int quantity = item.quantity;
            double weight = item.product.getWeight() * quantity;
            total += weight;
            String weightUnit;
            if (weight >= 1000) {
                weight /= 1000;
                weightUnit = "kg";
            }
            else
                weightUnit = "g";
            System.out.println(quantity + "x " + item.product.getName() + "   " + weight + " " + weightUnit);
        }
        String weightUnit;
        if (total >= 1000) {
            total /= 1000;
            weightUnit = "kg";
        }
        else
            weightUnit = "g";
        System.out.println("Total package weight " + total + " " + weightUnit + '\n');
        products.clear();
    }
}
