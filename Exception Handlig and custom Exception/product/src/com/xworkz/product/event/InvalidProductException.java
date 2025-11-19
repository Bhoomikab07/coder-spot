package com.xworkz.product.event;

public class InvalidProductException extends Exception{
    public InvalidProductException(){
        System.out.println("invalid product");
    }
}
