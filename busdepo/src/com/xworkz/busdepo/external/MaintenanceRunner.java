package com.xworkz.busdepo.external;


import com.xworkz.busdepo.internal.MaintenanceDto;

public class MaintenanceRunner {

        public static void main(String[] args) {
            MaintenanceDto maintenanceDto = new MaintenanceDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(maintenanceDto.toString());

            MaintenanceDto maintenanceDto1 = new MaintenanceDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            MaintenanceDto maintenanceDto2 = new MaintenanceDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            MaintenanceDto maintenanceDto3 = new MaintenanceDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(maintenanceDto1.hashCode());
            System.out.println(maintenanceDto2.hashCode());
            System.out.println(maintenanceDto3.hashCode());

            Object name = null;
            System.out.println(maintenanceDto1.equals(maintenanceDto3) && name == null);
        }

    }



