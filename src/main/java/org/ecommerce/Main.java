package org.ecommerce;

import org.ecommerce.Products.Cheese;
import org.ecommerce.Products.Product;
import org.ecommerce.Products.ScratchCard;
import org.ecommerce.Products.TV;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1500);
        Cart cart = new Cart();
        Product cheese = new Cheese("Cheese", 100, 24, 200, "07/30/2025");
        Product tv = new TV("TV", 1000, 4, 6000);
        Product scratchCard = new ScratchCard("Scratch Card", 10, 150);
        cart.addItem(cheese, 2);
        cart.addItem(tv, 1);
        cart.addItem(scratchCard, 4);
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customer, cart);
    }
}