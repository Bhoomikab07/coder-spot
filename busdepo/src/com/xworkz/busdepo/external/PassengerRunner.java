package com.xworkz.busdepo.external;


import com.xworkz.busdepo.internal.PassengerDto;

public class PassengerRunner {

        public static void main(String[] args) {
            PassengerDto passengerDto = new PassengerDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(passengerDto.toString());

            PassengerDto passengerDto1 = new PassengerDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            PassengerDto passengerDto2 = new PassengerDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            PassengerDto passengerDto3 = new PassengerDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(passengerDto1.hashCode());
            System.out.println(passengerDto2.hashCode());
            System.out.println(passengerDto3.hashCode());

            Object name = null;
            System.out.println(passengerDto1.equals(passengerDto3) && name == null);
        }

    }



