package com.xworkz.exceptionexamples.external;

import com.xworkz.exceptionexamples.events.HighCostException;
import com.xworkz.exceptionexamples.internal.Cost;

public class CostRunner {


        public static void main(String[] args) throws HighCostException {
            Cost cost=new Cost();
            cost.checkPrice(9999);

        }
    }


