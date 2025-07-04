package com.Ecommerce.Cart;

import com.Ecommerce.Main;
import com.Ecommerce.Product.*;
import com.Ecommerce.Product.Shippable;

public class cartItem {
    private Product product;
    private int quantity;
    public cartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getWeight(){
        if(product instanceof Shippable)
            return ((Shippable)product).getWeight();
        return 0;
    }
    public String getName(){
        return product.getName();
    }
    public int maxQuantity(){
        return product.getQuantity();
    }
    public double getPrice(){
        return product.getPrice();
    }
}
