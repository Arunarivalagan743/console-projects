package BusReserv.Service.Booking;

import BusReserv.Model.Bus;
import BusReserv.Model.Passenger;

import java.util.ArrayList;

public class BusBookingService implements BookingService {

    private ArrayList<Bus> busList;

    public BusBookingService(ArrayList<Bus> busList) {
        this.busList = busList;
    }

    @Override
    public Bus bookTicket(Passenger passenger) {

        for (Bus b : busList) {

            if (b.PassengerPathAvailble(passenger)) {

                System.out.println("Bus Found: " + b.getBusName());
                System.out.println("Ticket Booked Successfully");

                b.setCapacity(b.getCapacity() - 1);
                return b;
            }
        }

        System.out.println("Sorry Seat illa / Bus illa");
        return null;
    }
}