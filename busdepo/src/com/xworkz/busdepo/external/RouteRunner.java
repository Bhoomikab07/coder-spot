package com.xworkz.busdepo.external;

import com.xworkz.busdepo.internal.BusDto;
import com.xworkz.busdepo.internal.RouteDto;

public class RouteRunner {
        public static void main(String[] args) {
            RouteDto routeDto = new RouteDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(routeDto.toString());

            RouteDto routeDto1 = new RouteDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            RouteDto routeDto2 = new RouteDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            RouteDto routeDto3 = new RouteDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(routeDto1.hashCode());
            System.out.println(routeDto2.hashCode());
            System.out.println(routeDto3.hashCode());

            Object name = null;
            System.out.println(routeDto1.equals(routeDto3) && name == null);
        }

    }



