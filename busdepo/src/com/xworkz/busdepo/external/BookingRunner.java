package com.xworkz.busdepo.external;

import com.xworkz.busdepo.internal.BookingDto;

public class BookingRunner {

        public static void main(String[] args) {
            BookingDto bookingDto = new BookingDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(bookingDto.toString());

            BookingDto bookingDto1 = new BookingDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            BookingDto bookingDto2= new BookingDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            BookingDto bookingDto3= new BookingDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(bookingDto1.hashCode());
            System.out.println(bookingDto2.hashCode());
            System.out.println(bookingDto3.hashCode());

            Object name = null;
            System.out.println(bookingDto1.equals(bookingDto3) && name == null);
        }

    }



