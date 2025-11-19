package com.xworkz.tranction.event;

public class TransactionFailedException extends Exception{
    public TransactionFailedException(){
        System.out.println("failed");
    }
}
