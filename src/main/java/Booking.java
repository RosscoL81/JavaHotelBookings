public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;
    private int price;

    public Booking(int numberOfNights, Bedroom bedroom, int price){
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
        this.price = price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getPrice() {
        return this.price;
    }
}
