package com.xworkz.busdepo.external;

import com.xworkz.busdepo.internal.BusDto;
import com.xworkz.busdepo.internal.StaffDto;

public class StaffRunner {

        public static void main(String[] args) {
            StaffDto staffDto = new StaffDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(staffDto.toString());

            StaffDto staffDto1 = new StaffDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            StaffDto staffDto2 = new StaffDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            StaffDto staffDto3 = new StaffDto(101,'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(staffDto1.hashCode());
            System.out.println(staffDto2.hashCode());
            System.out.println(staffDto3.hashCode());

            Object name = null;
            System.out.println(staffDto1.equals(staffDto3) && name == null);
        }

    }



