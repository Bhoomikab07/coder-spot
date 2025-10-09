package com.xworkz.birds.external;

import com.xworkz.birds.internal.Chicks;
import com.xworkz.birds.internal.Hen;

public class HenRunner {
    public static void main(String[] args) {
        Hen name = new Chicks();
        name.henName();
        Chicks chicks =(Chicks)name;
        chicks.number();
    }
}
