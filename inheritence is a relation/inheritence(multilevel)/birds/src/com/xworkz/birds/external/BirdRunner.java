package com.xworkz.birds.external;

import com.xworkz.birds.internal.Birds;
import com.xworkz.birds.internal.Parrot;

public class BirdRunner {
    public static void main(String[] args){
        Birds birdName= new Parrot();
        birdName.name();
        Parrot parrot = (Parrot)birdName;
        parrot.birdColor();
    }
}
