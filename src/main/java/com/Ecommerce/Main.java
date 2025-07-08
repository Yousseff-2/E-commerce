package com.Ecommerce;

import com.Ecommerce.Cart.Cart;
import com.Ecommerce.Cart.cartItem;
import com.Ecommerce.Customer.Customer;
import com.Ecommerce.Product.ExpirableProduct;
import com.Ecommerce.Product.Product;
import com.Ecommerce.Product.ShippableNonExpirableProduct;
import com.Ecommerce.Service.Service;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpirableProduct cheese      = new ExpirableProduct("Cheese", 200,  10, LocalDate.now().plusDays(5));
        ExpirableProduct expiredMilk = new ExpirableProduct("Milk",   100,   5, LocalDate.now().minusDays(1));
        ShippableNonExpirableProduct tv   = new ShippableNonExpirableProduct("TV",   2000,   3,  8000.0);
        Product card  = new Product("ScratchCard", 50, 5);

        /// Normal
        Customer customer = new Customer("Youssef", 5000);
        Cart cart = new Cart();
        cart.add(new cartItem(cheese, 2));
        cart.add(new cartItem(tv, 1));
        cart.add(new cartItem(card, 1));
        Service srv = new Service();
        srv.checkOut(cart, customer);


        /// Empty Card
        Cart cart1 = new Cart();
        try {
            srv.checkOut(cart1, customer);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        /// Expired Product
        Cart cart2 = new Cart();
        cart2.add(new cartItem(expiredMilk, 2));
        try {
            srv.checkOut(cart2, customer);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        /// Insufficient balance
        Cart cart3 = new Cart();
        cart3.add(new cartItem(tv, 3));
        try {
            srv.checkOut(cart3, customer);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        /// Not enough in stock
        Cart cart4 = new Cart();
        cart4.add(new cartItem(cheese, 11));
        try {
            srv.checkOut(cart4, customer);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


}
