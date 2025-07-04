package org.ecommerce;

public class Customer {
    private double balance;

    public Customer(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void updateBalance(double amount) {
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.println("Customer current balance = " + this.balance);
    }
}
