package org.ecommerce;

import org.ecommerce.Products.Product;

import java.util.List;

public class CheckoutService {
    private final ShippingService shippingService;
    public CheckoutService() {
        shippingService = new ShippingService();
    }

    public void checkout(Customer customer, Cart cart) {
        List<Cart.CartItem> cartItems = cart.getItems();
        if (cartItems.isEmpty())
            throw new RuntimeException("Cart is empty!");
        if (cart.getTotal() > customer.getBalance())
            throw new RuntimeException("Customer balance is insufficient!");
        double shipping = 0;
        for (Cart.CartItem item : cartItems) {
            Product product = item.getProduct();
            int quantity = item.getQuantity();
            if (product.isShipping()) {
                shipping = 30;
                shippingService.addItem(product, quantity);
            }
        }
        shippingService.ShipItems();
        System.out.println("** Checkout receipt **");
        for (Cart.CartItem item : cartItems) {
            Product product = item.getProduct();
            int quantity = item.getQuantity();
            System.out.println(quantity + "x " + product.getName() + "   " + product.getPrice() * quantity);
        }
        double subtotal = cart.getTotal();
        double total = subtotal + shipping;
        customer.updateBalance(total);
        System.out.println("-----------------------");
        System.out.println("Subtotal   " + subtotal);
        System.out.println("Shipping   " + shipping);
        System.out.println("Amount   " + total);
        cart.clearCart();
    }
}
