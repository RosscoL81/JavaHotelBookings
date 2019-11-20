import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double");
        booking = new Booking(7, bedroom, 100);
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(7, this.booking.getNumberOfNights());

    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, this.booking.getBedroom());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, this.booking.getPrice());
    }


}
