package com.xworks.car.internal;

public class Engine {
    public int power;
    public double cc;

    public Engine(int power,double cc){
        this.power=power;
        this.cc=cc;

    }
    public void displayEngine(){
        System.out.println("engine power="+power);
        System.out.println("engine cc="+cc);
    }
}
