package com.xworkz.busdepo.external;


import com.xworkz.busdepo.internal.DepoDto;

public class DepoRunner {

        public static void main(String[] args) {
            DepoDto depoDto = new DepoDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(depoDto.toString());

            DepoDto depoDto1 = new DepoDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            DepoDto depoDto2 = new DepoDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            DepoDto depoDto3 = new DepoDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(depoDto1.hashCode());
            System.out.println(depoDto2.hashCode());
            System.out.println(depoDto3.hashCode());

            Object name = null;
            System.out.println(depoDto1.equals(depoDto3) && name == null);
        }

    }



