package com.xworkz.exceptionexamples.external;

import com.xworkz.exceptionexamples.events.InvalidAgeException;
import com.xworkz.exceptionexamples.internal.Age;

public class AgeRunner {


        public static void main(String[] args) throws InvalidAgeException {
            Age age=new Age();
            age.checkAge(14);

        }
    }


