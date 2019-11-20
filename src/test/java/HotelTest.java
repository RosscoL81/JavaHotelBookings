import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom conferenceRoom;
    private ConferenceRoom conferenceRoom2;
    private Guest guest;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before(){
        hotel = new Hotel("Grand Java Paradise Hotel");
        bedroom = new Bedroom(1, 2, "double");
        bedroom2 = new Bedroom(2, 1, "single");
        bedroom3 = new Bedroom(3, 2, "double");
        conferenceRoom = new ConferenceRoom("Great Room of Conferences", 3);
        conferenceRoom2 = new ConferenceRoom("Even Greater Room of Conferences", 5);
        guest = new Guest("Alfredo");
        guest2 = new Guest("Maria");
        guest3 = new Guest("Alba");
        guest4 = new Guest("Don Quijote");
        guest5 = new Guest("Antonio");

    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuest(guest, bedroom);
        hotel.addGuest(guest2, bedroom);
        hotel.addGuest(guest3, bedroom);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuest(guest, bedroom);
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.guestCount());
    }

}
