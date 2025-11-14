package com.xworkz.busdepo.external;

import com.xworkz.busdepo.internal.BusDto;
import com.xworkz.busdepo.internal.ScheduleDto;

public class ScheduleRunner {
        public static void main(String[] args) {
            ScheduleDto scheduleDto = new ScheduleDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(scheduleDto.toString());

            ScheduleDto scheduleDto1 = new ScheduleDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            ScheduleDto scheduleDto2 = new ScheduleDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            ScheduleDto scheduleDto3 = new ScheduleDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(scheduleDto1.hashCode());
            System.out.println(scheduleDto2.hashCode());
            System.out.println(scheduleDto3.hashCode());

            Object name = null;
            System.out.println(scheduleDto1.equals(scheduleDto3) && name == null);
        }

    }



