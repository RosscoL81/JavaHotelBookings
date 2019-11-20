import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.conferenceGuests = new ArrayList<Guest>();
    }

    public int guestCount() {
        return this.conferenceGuests.size();
    }

    public void addGuest(Guest guest) {
        if (this.hasCapacity()){
            this.conferenceGuests.add(guest);
        }
    }

    public boolean hasCapacity() {
        return this.guestCount() < this.capacity;
    }
}


