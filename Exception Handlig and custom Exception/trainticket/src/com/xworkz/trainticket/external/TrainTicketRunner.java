package com.xworkz.trainticket.external;

import com.xworkz.trainticket.internal.TrainTicket;

public class TrainTicketRunner {
        public static void main(String[] args) {
            TrainTicket tickets = new TrainTicket();
      tickets.checkAge(60);
        //    tickets.checkAge(30);
      tickets.checkName("Sushma");
      //      tickets.checkName("naik");
        tickets.checkTicket(20);
          //  tickets.checkTicket(10);
        tickets.seatBook(150);
           // tickets.seatBook(90);
          tickets.seatCancel("Arun");
           // tickets.seatCancel("MMM");
        }
    }


