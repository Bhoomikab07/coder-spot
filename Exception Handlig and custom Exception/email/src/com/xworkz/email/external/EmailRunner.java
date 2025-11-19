package com.xworkz.email.external;

import com.xworkz.email.internal.Email;

public class EmailRunner {

        public static void main(String[] args) {
            Email email=new Email();

            email.checkAge(30);
            email.checkName("Bhoomika");

            email.numberOutOfUsers(6000);

            email.passwordCheck("Bhoomi@123");
            email.email(".com");
        }
    }


