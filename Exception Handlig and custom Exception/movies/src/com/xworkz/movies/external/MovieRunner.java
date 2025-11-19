package com.xworkz.movies.external;

import com.xworkz.movies.internal.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.checkTicket(188);
        movie.checkPayment(99);
        movie.checkSeat(10);
        movie.checkShow("morning");
        movie.checkBooking(30);
    }
}
