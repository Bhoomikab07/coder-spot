package com.xworkz.tickets.external;

import com.xworkz.tickets.internal.TrainTicket;

public class TicketRunner {

        public static void main(String [] ref)
        {
            TrainTicket ticket = new TrainTicket("Bhoomika",300,451234568l,40.23f,350.234,'A',true);
            ticket.displayTrainTicket();

        }
    }

