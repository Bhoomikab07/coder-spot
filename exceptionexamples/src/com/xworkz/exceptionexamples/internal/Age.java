package com.xworkz.exceptionexamples.internal;

import com.xworkz.exceptionexamples.events.InvalidAgeException;

public class Age {


        public void checkAge(int age) throws InvalidAgeException {
            if (age<18){
                throw new InvalidAgeException("age is valid for voteing");

            }
            else {
                System.out.println("age is valid for voiting");
            }

        }
    }


