package com.xworkz.busdepo.external;

import com.xworkz.busdepo.internal.BusDto;

public class BusRunner {
    public static void main(String[] args) {
        BusDto busDto = new BusDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                'A', false, 500.00, 250.0f, 4535365L);

        System.out.println(busDto.toString());

        BusDto busDto1 = new BusDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
        BusDto busDto2 = new BusDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
        BusDto busDto3 = new BusDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

        System.out.println(busDto1.hashCode());
        System.out.println(busDto2.hashCode());
        System.out.println(busDto3.hashCode());

        Object name = null;
        System.out.println(busDto1.equals(busDto3) && name == null);
    }

    }

