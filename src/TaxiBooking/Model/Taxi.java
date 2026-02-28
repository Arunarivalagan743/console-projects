


package TaxiBooking.Model;

import java.util.ArrayList;
import java.util.List;

public class Taxi {

    private int id;
    private char position;
    private int freeTime;
    private int earnings;

    private List<Booking> bookings;

    public Taxi(int id) {
        this.id = id;
        this.position = 'A';
        this.freeTime = 0;
        this.earnings = 0;
        this.bookings = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public char getPosition() {
        return position;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getEarnings() {
        return earnings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    // Update after booking
    public void addBooking(Booking b) {
        bookings.add(b);
        this.position = b.getDrop();
        this.freeTime = b.getDropTime();
        this.earnings += b.getAmount();
    }
}