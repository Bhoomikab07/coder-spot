package com.xworkz.device.external;

import com.xworkz.device.internal.Charger;
import com.xworkz.device.internal.Laptop;
import com.xworkz.device.internal.LaptopDetails;

public class LaptopRunner {
    public static void main(String[] args) {
        Charger charger = new Charger(500);
        Laptop laptop = new LaptopDetails(40000,"HP",charger);
        laptop.displayLaptop();
    }
}
