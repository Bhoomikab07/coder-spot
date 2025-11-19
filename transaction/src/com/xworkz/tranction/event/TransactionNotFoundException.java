package com.xworkz.tranction.event;

public class TransactionNotFoundException extends Exception{
    public TransactionNotFoundException(){
        System.out.println("not found");
    }
}
