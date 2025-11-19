package com.xworkz.movies.event;

public class PaymentFailedException extends Exception{
    public PaymentFailedException(){
        System.out.println("this Payemnt exception");
    }
}
