package com.xworkz.movies.internal;

import com.xworkz.movies.event.*;

public class Movie {
    public void checkTicket(int price){
        if (price<200){
            try {
                throw new InvalidTicketException();
            }catch (InvalidTicketException invalidTicketException){
                invalidTicketException.printStackTrace();
                System.out.println("valid price");
            }
        }else{
            System.out.println("invalid price");
        }
    }
    public void checkPayment(int cost){
        if (cost<100){
            try{
                throw new PaymentFailedException();

            }catch (PaymentFailedException paymentFailedException){
                paymentFailedException.printStackTrace();
                System.out.println("valid payment");
            }
        }else{
            System.out.println("invalid payment");
        }
    }
    public void checkSeat(int number){
        if (number<20){
            try{
                throw new SeatNotAllowedException();

            }catch (SeatNotAllowedException seatNotAllowedException){
                seatNotAllowedException.printStackTrace();
                System.out.println("valid");
            }
        }else {
            System.out.println("invalid");
        }
    }
    public void checkShow(String name){
        if (name=="morning"){
            try{
                throw new ShowFullException();

            }catch (ShowFullException showFullException){
                showFullException.printStackTrace();
                System.out.println("full");
            }
        }else{
            System.out.println("not full");
        }
    }
    public void checkBooking(int total){
        if (total<50){
            try {
                throw new TicketAlreadyBookedException();
            }catch (TicketAlreadyBookedException ticketAlreadyBookedException){
                ticketAlreadyBookedException.printStackTrace();
                System.out.println("not sold");
            }

        }else {
            System.out.println("already sold");
        }
    }

}
