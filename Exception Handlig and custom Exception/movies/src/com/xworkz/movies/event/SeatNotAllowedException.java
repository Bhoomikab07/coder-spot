package com.xworkz.movies.event;

public class SeatNotAllowedException extends Exception{
    public SeatNotAllowedException(){
        System.out.println("seat not allowed exception");
    }
}
