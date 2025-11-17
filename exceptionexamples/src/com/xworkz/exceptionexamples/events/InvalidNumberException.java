package com.xworkz.exceptionexamples.events;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String s)
    {
        System.out.println("in valid number");
    }
}
