package com.xworks.car.external;

import com.xworks.car.internal.Car;
import com.xworks.car.internal.CarDetails;
import com.xworks.car.internal.Engine;

public class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine(150,25);
        Car car = new CarDetails(4,"petrol",engine);
        car.displayCar();
    }
}
