package TaxiBooking.Model;

public class Customer {

    private int id;
    private char pickup;
    private char drop;
    private int pickTime;

    public Customer(int id, char pickup, char drop, int time) {
        this.id = id;
        this.pickup = pickup;
        this.drop = drop;
        this.pickTime = time;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getTime() {
        return pickTime;
    }
}