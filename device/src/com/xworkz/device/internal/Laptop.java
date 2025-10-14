package com.xworkz.device.internal;

import javax.swing.text.AbstractDocument;

public abstract class Laptop {
    public int price;
    public String laptopName;
    public Charger charger;

    public Laptop(int price, String laptopName,Charger charger){
        this.price=price;
        this.laptopName=laptopName;
        this.charger=charger;

    }
    public void displayLaptop(){
        System.out.println("laptop price="+price);
        System.out.println("laptop name="+laptopName);
        System.out.println("charger price="+charger.chargerPrice);
    }
}
