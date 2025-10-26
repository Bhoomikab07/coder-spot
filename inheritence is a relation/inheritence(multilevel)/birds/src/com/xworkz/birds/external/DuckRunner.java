package com.xworkz.birds.external;

import com.xworkz.birds.internal.Duck;
import com.xworkz.birds.internal.Duckling;

public class DuckRunner {
    public static void main(String[] args) {
        Duck ducks = new Duckling();
        ducks.name();
        Duckling duckling =(Duckling)ducks;
        duckling.duckNumber();
    }
}
