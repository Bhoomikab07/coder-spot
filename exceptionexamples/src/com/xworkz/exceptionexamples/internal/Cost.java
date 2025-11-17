package com.xworkz.exceptionexamples.internal;

import com.xworkz.exceptionexamples.events.HighCostException;

public class Cost {

        public void checkPrice(int cost) throws HighCostException {
            if(cost>8999){
                throw new HighCostException("its too high cost product");
            }
            else {
                System.out.println("its a normal cost product");
            }
        }
    }

