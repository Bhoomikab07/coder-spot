package com.xworkz.travell.external;

import com.xworkz.travell.internal.Travell;

public class TravellRunner {

        public static void main(String[] args) {
            Travell transport=new Travell();
            transport.bus("KA161017");
            //transport.bus("KA161016");

            transport.condition(true);

            transport.cost(55);

            transport.total(2.999);

            transport.transport("public");
        }
    }


