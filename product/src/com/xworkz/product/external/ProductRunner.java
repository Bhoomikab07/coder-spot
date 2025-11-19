package com.xworkz.product.external;

import com.xworkz.product.internal.Product;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.checkProduct("Soap");
        product.checkExpire(2025);
        product.checkFound("ToothPaste");
        product.checkStock(99);
        product.checkPrice(199);
    }
}
