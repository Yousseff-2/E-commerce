package com.Ecommerce.Cart;

import com.Ecommerce.Product.Shippable;

import java.util.ArrayList;

public class Cart {
    private ArrayList<cartItem> ShippableProducts, NotShippableProducts;
    private double sum;
    public Cart() {
        ShippableProducts = new ArrayList<>();
        NotShippableProducts = new ArrayList<>();
        sum = 0;
    }
    public void add(cartItem product) {
        if(product.getProduct() instanceof Shippable)ShippableProducts.add(product);
        else NotShippableProducts.add(product);
        sum += product.getQuantity() * product.getPrice();
    }
    public boolean empty(){
        return (ShippableProducts.isEmpty() && NotShippableProducts.isEmpty());
    }
    public ArrayList<cartItem> getShippableProducts() {
        return ShippableProducts;
    }
    public ArrayList<cartItem> getNotShippableProducts() {
        return NotShippableProducts;
    }
    public double getSum() {
        return sum;
    }
}
