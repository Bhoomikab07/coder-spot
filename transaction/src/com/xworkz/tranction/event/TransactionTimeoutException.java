package com.xworkz.tranction.event;

public class TransactionTimeoutException extends Exception{
    public TransactionTimeoutException(){
        System.out.println("timeout");
    }
}
