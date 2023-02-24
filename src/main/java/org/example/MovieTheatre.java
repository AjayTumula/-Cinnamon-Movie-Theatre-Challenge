package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MovieTheatre {
    public List<String> availableSeatsList = new LinkedList<String>(Arrays.asList( "A1","A2","A3","A4","A5","B1","B2","B3","B4","B5",
            "C1","C2","C3","C4","C5"));

    public List allocateSeat(int numberOfSeats) throws Exception {
        List selectedSeats = new ArrayList<String>();
        if((numberOfSeats > 0) && (numberOfSeats<= 3)) {
            if(availableSeatsList.size() >= numberOfSeats) {
                for (int i = 0; i < numberOfSeats; i++) {
                    selectedSeats.add(availableSeatsList.get(i));
                }
            }
            else{
                throw new Exception("Requested number of Seats are not available");
            }
        } else{
            throw new Exception("The Requested number of Seats is invalid");
        }
        availableSeatsList.removeAll(selectedSeats);
        return selectedSeats;
    }
}
