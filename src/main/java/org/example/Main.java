package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        MovieTheatre movieTheatre = new MovieTheatre();
        System.out.println(movieTheatre.allocateSeat(2));
        System.out.println(movieTheatre.allocateSeat(3));
        System.out.println(movieTheatre.allocateSeat(3));
        System.out.println(movieTheatre.allocateSeat(3));
        System.out.println(movieTheatre.allocateSeat(2));
        System.out.println(movieTheatre.allocateSeat(2));
        System.out.println(movieTheatre.allocateSeat(1));
    }
}