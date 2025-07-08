package com.Ecommerce.Product;

import com.Ecommerce.Main;

public class ShippableNonExpirableProduct extends Product implements Shippable {
    private double weight;
    public ShippableNonExpirableProduct(String productName, int productPrice, int productQuantity, double weight) {
        super(productName, productPrice, productQuantity);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
