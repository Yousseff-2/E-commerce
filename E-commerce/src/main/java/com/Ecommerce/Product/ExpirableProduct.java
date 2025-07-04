package com.Ecommerce.Product;

import com.Ecommerce.Main;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Expirable{
    private LocalDate expireDate;
    public ExpirableProduct(String productName, int productPrice, int productQuantity, LocalDate expireDate) {
        super(productName, productPrice, productQuantity);
        this.expireDate = expireDate;
    }
    public LocalDate getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
    public boolean isExpired() {
        return LocalDate.now().isAfter(expireDate);
    }
}
