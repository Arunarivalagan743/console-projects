package BusReserv.Service.Booking;


import BusReserv.Model.Bus;
import BusReserv.Model.Passenger;

public interface BookingService {

    Bus bookTicket(Passenger passenger);

}