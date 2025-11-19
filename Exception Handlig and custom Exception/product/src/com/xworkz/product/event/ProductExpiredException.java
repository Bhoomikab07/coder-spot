package com.xworkz.product.event;

public class ProductExpiredException extends Exception{
    public ProductExpiredException(){
        System.out.println("Expire");
    }
}
