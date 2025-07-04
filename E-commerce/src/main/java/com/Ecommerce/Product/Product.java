package com.Ecommerce.Product;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public String getName() {
        return productName;
    }
    public void setName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return productPrice;
    }
    public void setPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getQuantity() {
        return productQuantity;
    }
    public void setQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
