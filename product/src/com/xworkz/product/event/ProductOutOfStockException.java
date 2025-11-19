package com.xworkz.product.event;

public class ProductOutOfStockException extends Exception{
    public ProductOutOfStockException(){
        System.out.println("product exception");
    }
}
