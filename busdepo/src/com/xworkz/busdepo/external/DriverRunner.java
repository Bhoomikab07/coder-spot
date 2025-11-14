package com.xworkz.busdepo.external;
import com.xworkz.busdepo.internal.DriverDto;

public class DriverRunner {

        public static void main(String[] args) {
            DriverDto driverDto = new DriverDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(driverDto.toString());

            DriverDto driverDto1 = new DriverDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            DriverDto driverDto2 = new DriverDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            DriverDto driverDto3 = new DriverDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(driverDto1.hashCode());
            System.out.println(driverDto2.hashCode());
            System.out.println(driverDto3.hashCode());

            Object name = null;
            System.out.println(driverDto1.equals(driverDto3) && name == null);
        }

    }



