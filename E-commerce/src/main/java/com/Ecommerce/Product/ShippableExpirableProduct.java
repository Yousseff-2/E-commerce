package com.Ecommerce.Product;

import java.time.LocalDate;

public class ShippableExpirableProduct extends ExpirableProduct implements Shippable, Expirable {
    private double weight;
    public ShippableExpirableProduct(String productName, int productPrice, int productQuantity, double weight, LocalDate expireDate) {
        super(productName, productPrice, productQuantity, expireDate);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isExpired() {return super.isExpired();}
}
