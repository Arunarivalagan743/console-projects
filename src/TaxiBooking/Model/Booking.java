package TaxiBooking.Model;

public class Booking {

    private int bookingId;
    private int taxiId;
    private char pickup;
    private char drop;
    private int pickupTime;
    private int dropTime;
    private int amount;

    public Booking(int bookingId, int taxiId, char pickup,
                   char drop, int pickupTime, int dropTime, int amount) {

        this.bookingId = bookingId;
        this.taxiId = taxiId;
        this.pickup = pickup;
        this.drop = drop;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.amount = amount;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public char getDrop() {
        return drop;
    }

    public int getDropTime() {
        return dropTime;
    }

    public int getAmount() {
        return amount;
    }

    public void display() {

        System.out.println(
                bookingId + "\t" +
                        taxiId + "\t" +
                        pickup + "\t" +
                        drop + "\t" +
                        pickupTime + "\t" +
                        dropTime + "\t" +
                        amount
        );
    }
}