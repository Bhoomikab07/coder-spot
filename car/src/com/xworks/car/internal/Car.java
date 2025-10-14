package com.xworks.car.internal;

public abstract class Car {
    public int noOfStrokes;
    public String engineType;
    public Engine engine;

    public Car(int noOfStrokes,String engineType,Engine engine){
        this.noOfStrokes=noOfStrokes;
        this.engineType=engineType;
        this.engine=engine;
    }
    public void displayCar(){

        System.out.println("name of strokes="+noOfStrokes);
        System.out.println("engine type="+engineType);
        System.out.println("engine power="+engine.power);
        System.out.println("cc="+engine.cc);
    }
}
