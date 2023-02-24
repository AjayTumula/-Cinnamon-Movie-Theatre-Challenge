import org.example.MovieTheatre;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MovieTheatreTest {

    @Test
    public void allocateFirstThreeSeats() throws Exception {
        MovieTheatre movieTheatre = new MovieTheatre();
        //Arrange
        List expectedList = new ArrayList<String>();
        expectedList.add("A1");
        expectedList.add("A2");
        expectedList.add("A3");
        //Act and Assert
        assertEquals(expectedList, movieTheatre.allocateSeat(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 3, 3, 2, 2})
    public void testAllTheSeatsAllocatedOrNot(int seats) throws Exception {
        //Arrange
        MovieTheatre movieTheatre1 = new MovieTheatre();
        int seatsAllocated = 0;
        //Act
        List allocation = movieTheatre1.allocateSeat(seats);
        seatsAllocated = allocation.size();
        //Assert
        assertEquals(seats, seatsAllocated);
    }

    @Test
    public void testWhenTheuserInputIsAboveThree() throws Exception {
        //Arrange
        MovieTheatre movieTheatre2 = new MovieTheatre();
        //Act
        Exception exception = assertThrows(Exception.class, () -> movieTheatre2.allocateSeat(4));
        //Assert
        assertEquals("The Requested number of Seats is invalid", exception.getMessage());
    }

    @Test
    public void testWhenTheuserInputIsZeroException() {
        //Arrange
        MovieTheatre movieTheatre3 = new MovieTheatre();
        //Act
        Exception exception = assertThrows(Exception.class, () -> movieTheatre3.allocateSeat(0));
        //Assert
        assertEquals("The Requested number of Seats is invalid", exception.getMessage());
    }
}
