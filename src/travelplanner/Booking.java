package travelplanner;

public class Booking {
    private final int bookingId;
    private final int userId;
    private final String type;
    private final int referenceId;
    private String status;

    public Booking(int bookingId, int userId, String type, int referenceId, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.type = type;
        this.referenceId = referenceId;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public String getType() {
        return type;
    }

    public int getReferenceId() {
        return referenceId;
    }

    public String getStatus() {
        return status;
    }

    public void confirmBooking() {
        status = "CONFIRMED";
    }

    public void cancelBooking() {
        status = "CANCELLED";
    }
}
