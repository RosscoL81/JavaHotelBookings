import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Bob");
        guest2 = new Guest("Liz");
        guest3 = new Guest("Charlie");
        bedroom = new Bedroom(1, 2, "double");
    }

    @Test
    public void testCountGuests(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void testHasCapacity() {
        assertEquals(true, bedroom.hasCapacity());
    }

    @Test
    public void testCanAddGuest_whereCapacity(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void testCantAddGuest_noCapacity(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }


}

