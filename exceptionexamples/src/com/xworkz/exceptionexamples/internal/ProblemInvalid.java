package com.xworkz.exceptionexamples.internal;

import com.xworkz.exceptionexamples.events.InvalidNumberException;

public class ProblemInvalid {
    public void issue(int age) throws InvalidNumberException{
        if (age >=30){
            System.out.println("valid age="+age);
        }else {
            throw new InvalidNumberException("invalid age="+age);

        }
    }
}
