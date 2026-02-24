package BusReserv.Model;

public class Booking {
   private String passengerName;
    private String Path;
    private double bookingCost;
    private  String destination;


    public String getBusName() {
        return BusName;
    }

    public void setBusName(String busName) {
        BusName = busName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public double getBookingCost() {
        return bookingCost;
    }

    public void setBookingCost(double bookingCost) {
        this.bookingCost = bookingCost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String BusName;

    public Booking(String passengerName, String busName, String path, double bookingCost, String destination) {
        this.passengerName = passengerName;
        BusName = busName;
        Path = path;
        this.bookingCost = bookingCost;
        this.destination = destination;
    }


    public void displayBokking()
    {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Bus Name       : " + BusName);
        System.out.println("Destination    : " + destination);
        System.out.println("Ticket Price   : ₹" + bookingCost);
    }
}
