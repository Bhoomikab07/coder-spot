package com.xworkz.movies.event;

public class TicketAlreadyBookedException extends Exception{
    public TicketAlreadyBookedException(){
        System.out.println("ticket exception");
    }
}
