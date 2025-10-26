package com.xworkz.bakery.internal;

public class Bakery {

        public String bakeryName;
        public float rating;
        public Sweet value ;

        public Bakery(String bakeryName,float rating,Sweet value)
        {
            this.bakeryName=bakeryName;
            this.rating=rating;
            this.value=value;
        }
        public void bakeryDetailes()
        {
            System.out.println("Bakery name :"+bakeryName+ ","+"Bakery rating :"+rating);
            System.out.println("Sweet name :"+value.sweetName+ "," +"Sweet price :"+value.price);

        }
    }

