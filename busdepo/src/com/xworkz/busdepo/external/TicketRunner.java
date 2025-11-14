package com.xworkz.busdepo.external;


import com.xworkz.busdepo.internal.TicketDto;

public class TicketRunner {

        public static void main(String[] args) {
            TicketDto ticketDto = new TicketDto(100, 'A', 4354365L, 234.5, true, 1.5f, 150, "VRL",
                    'A', false, 500.00, 250.0f, 4535365L);

            System.out.println(ticketDto.toString());

            TicketDto ticketDto1 = new TicketDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            TicketDto ticketDto2 = new TicketDto(101, 'B', 356467L, 200.0, false, 2.00f, 200, "Volvo", 'B', true, 750.0, 350.0f, 356467L);
            TicketDto ticketDto3 = new TicketDto(101, 'C', 356547L, 200.0, true, 2.00f, 200, "Volvo", 'B', false, 750.0, 700.0f, 343648L);

            System.out.println(ticketDto1.hashCode());
            System.out.println(ticketDto2.hashCode());
            System.out.println(ticketDto3.hashCode());

            Object name = null;
            System.out.println(ticketDto1.equals(ticketDto3) && name == null);
        }

    }



