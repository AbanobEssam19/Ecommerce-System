package org.ecommerce;

import org.ecommerce.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public class CartItem {
        private Product product;
        private int quantity;

        public CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return this.product;
        }

        public int getQuantity() {
            return this.quantity;
        }
    }
    private List<CartItem> items;

    private double total;

    public Cart() {
        this.items = new ArrayList<>();
        total = 0;
    }

    public void addItem(Product product, int quantity) {
        if (product.hasExpired()) {
            throw new RuntimeException("Product " + product.getName() + " has expired!");
        }
        if (quantity <= product.getAvailableQuantity()) {
            product.updateAvailableQuantity(quantity);
            items.add(new CartItem(product, quantity));
            total += product.getPrice() * quantity;
        }
        else {
            throw new RuntimeException("Product " + product.getName() + " doesn't have the requested quantity!");
        }
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotal() {
        return this.total;
    }

    public void clearCart() {
        this.items.clear();
        this.total = 0;
    }
}
