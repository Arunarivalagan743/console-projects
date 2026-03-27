package travelplanner;

public class BookingService {

    public Booking createBooking(User user, Accommodation accommodation, int bookingId) {
        Booking booking = new Booking(
                bookingId,
                user.getUserId(),
                "ACCOMMODATION",
                accommodation.getAccommodationId(),
                "PENDING"
        );
        booking.confirmBooking();
        return booking;
    }

    public Booking createTransportBooking(User user, Transport transport, int bookingId) {
        Booking booking = new Booking(
                bookingId,
                user.getUserId(),
                "TRANSPORT",
                transport.getTransportId(),
                "PENDING"
        );
        booking.confirmBooking();
        return booking;
    }

    public void cancelBooking(Booking booking) {
        booking.cancelBooking();
    }
}
