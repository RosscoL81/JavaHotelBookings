import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;

    private Guest guest;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;


    @Before
    public void before(){
        guest = new Guest("Alfredo");
        guest2 = new Guest("Maria");
        guest3 = new Guest("Alba");
        guest4 = new Guest("Don Quijote");


        conferenceRoom = new ConferenceRoom("Great Room of Conferences", 3);
    }

    @Test
    public void testCountGuests(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void testCanAddGuest_whereCapacity(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void testCantAddGuest_noCapacity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        assertEquals(3, conferenceRoom.guestCount());
    }

    @Test
    public void testHasCapacity() {
        assertEquals(true, conferenceRoom.hasCapacity());
    }
}
