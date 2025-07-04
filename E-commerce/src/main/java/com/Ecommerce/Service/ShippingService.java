package com.Ecommerce.Service;

import com.Ecommerce.Cart.cartItem;

import java.util.ArrayList;

public class ShippingService {
    double Fees;
    ShippingService(double Fees) {
        this.Fees = Fees;
    }
    double Checkout(ArrayList<cartItem>p){
        System.out.println("** Shipment notice **");
        double total = 0;
        for (cartItem item : p) {
            total += item.getQuantity() * item.getWeight();
            System.out.println(item.getQuantity() + "x " + item.getName() + "     " + item.getWeight() * item.getQuantity() + "g");
        }
        total = total / 1000;
        System.out.println("Total package weight " + total + "kg");
        System.out.println();
        total = total * Fees;
        return total;
    }
}
