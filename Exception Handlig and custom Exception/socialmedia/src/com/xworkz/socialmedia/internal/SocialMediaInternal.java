package com.xworkz.socialmedia.internal;

import com.xworkz.socialmedia.event.*;

public class SocialMediaInternal {
    public void checkName(String name) {
        if (name == "Bhoomika") {
            try {
                throw new CheckNameException();
            } catch (CheckNameException checkNameException) {
                checkNameException.printStackTrace();
                System.out.println("valid name");
            }
        } else {
            System.out.println("invalid name");
        }
    }


        public void checkId ( int id) {
            if (id < 100) {
                try {
                    throw new CheckIdException();
                } catch (CheckIdException checkIdException) {
                    checkIdException.printStackTrace();
                    System.out.println("valid Id");
                }
            } else {
                System.out.println("invalid id");

            }
        }
        public void checkNumber ( long number) {
            if (number < 1000) {
                try {
                    throw new CheckNumberException();
                } catch (CheckNumberException checkNumberException) {
                    checkNumberException.printStackTrace();
                    System.out.println("valid number");
                }
            } else {
                System.out.println("invalid number");
            }
        }
        public void checkProfile(String name){
        if (name=="Bhoomi"){
            try{
                throw new CheckProfileException();

                }catch (CheckProfileException checkProfileException){
                checkProfileException.printStackTrace();
                System.out.println("valid profile");
            }
        }else {
            System.out.println("invalid profile");
        }
        }
        public void checkUser(String name){
        if (name=="Bhanu"){
            try{
                throw new CheckUserException();
            }catch (CheckUserException checkUserException){
                checkUserException.printStackTrace();
                System.out.println("valid user");
            }
        }else {
            System.out.println("invalid user");
        }
        }

}

