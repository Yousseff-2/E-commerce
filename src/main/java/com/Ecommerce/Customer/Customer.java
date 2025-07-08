package com.Ecommerce.Customer;

public class Customer {
    private String name;
    private double balance;
    public Customer(String name,double balance) {
        if(balance < 0)throw new IllegalStateException("Balance cannot be negative");
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}