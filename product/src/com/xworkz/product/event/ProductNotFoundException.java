package com.xworkz.product.event;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(){
        System.out.println("not found");
    }
}
