package com.Ecommerce.Service;

import com.Ecommerce.Cart.Cart;
import com.Ecommerce.Cart.cartItem;
import com.Ecommerce.Customer.Customer;
import com.Ecommerce.Product.Expirable;

public class Service {
    public void checkOut(Cart cart, Customer customer) throws IllegalStateException {
        CheckCart(cart, customer);
        ShippingService srv = new ShippingService(3);
        double total = srv.Checkout(cart.getShippableProducts());
        System.out.println("** Checkout receipt **");
        for (cartItem item : cart.getNotShippableProducts()) {
            System.out.println(item.getQuantity() + "x " + item.getName() + "     " + item.getPrice());
        }
        System.out.println("--------------------------------");
        System.out.println("Subtotal: " + cart.getSum());

        System.out.println("Shipping: " + total);
        total = total + cart.getSum();
        System.out.println("Amount: " + total);
    }
    public void CheckCart(Cart cart, Customer customer) throws IllegalStateException {
        if(cart.empty()) {throw new IllegalStateException("Cart is empty");}
        if(cart.getSum() > customer.getBalance())throw new IllegalStateException("Not enough balance");
        for (cartItem item : cart.getNotShippableProducts()){
            if(item.getProduct() instanceof Expirable && ((Expirable)item.getProduct()).isExpired()) {
                throw new IllegalStateException(item.getName() + " : is expired");
            }
            if(item.maxQuantity() < item.getQuantity()) {
                throw new IllegalStateException(item.getName() + " : Not enough in stock");
            }
        }
        for (cartItem item : cart.getShippableProducts()){
            if(item.getProduct() instanceof Expirable && ((Expirable)item.getProduct()).isExpired()) {
                throw new IllegalStateException(item.getName() + " : is expired");
            }
            if(item.maxQuantity() < item.getQuantity()) {
                throw new IllegalStateException(item.getName() + " : Not enough in stock");
            }
        }
    }
}
