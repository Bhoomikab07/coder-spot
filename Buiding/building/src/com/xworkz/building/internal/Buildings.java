package com.xworkz.building.internal;

public class Buildings {

    public void displayBuildings(Floors[] floors) {
        for (Floors floor : floors) {
            floor.displayFloor();
        }
    }
}



