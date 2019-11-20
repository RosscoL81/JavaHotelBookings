import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> bedroomGuests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.bedroomGuests = new ArrayList<Guest>();

    }


    public int guestCount() {
        return this.bedroomGuests.size();
    }

    public boolean hasCapacity(){
        return this.guestCount() < this.capacity;
    }

    public void addGuest(Guest guest) {
        if (hasCapacity()) {
            this.bedroomGuests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.bedroomGuests.remove(guest);
    }
}
