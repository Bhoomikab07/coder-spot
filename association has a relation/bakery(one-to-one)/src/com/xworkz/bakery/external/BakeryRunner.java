package com.xworkz.bakery.external;

import com.xworkz.bakery.internal.*;


public class BakeryRunner {

        public static void main(String [] args)
        {
            Sweet sweet = new Sweet("Jamun",500);
            Bakery bakery = new Bakery("Iyenger Bekary",5.6f,sweet);
            bakery.bakeryDetailes();
        }
    }

