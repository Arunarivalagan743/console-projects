package TaxiBooking.Service;

import TaxiBooking.Model.Booking;
import TaxiBooking.Model.Customer;
import TaxiBooking.Model.Taxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiServiceImpl implements TaxiService {

    private List<Taxi> taxis = new ArrayList<>();
    private int bookingId = 1;

    public TaxiServiceImpl(int numberOfTaxis) {
        for (int i = 1; i <= numberOfTaxis; i++) {
            taxis.add(new Taxi(i));
        }
    }

    @Override
    public void bookTaxi(Customer c) {

        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        for (Taxi t : taxis) {

            if (t.getFreeTime() <= c.getTime()) {

                int distance =
                        Math.abs(t.getPosition() - c.getPickup());

                if (distance < minDistance ||(distance == minDistance && t.getEarnings() < (selectedTaxi == null ? Integer.MAX_VALUE : selectedTaxi.getEarnings()))) {

                    minDistance = distance;
                    selectedTaxi = t;
                }
            }
        }

        if (selectedTaxi == null) {
            System.out.println("No Taxi Available");
            return;
        }

        int travelDistance =
                Math.abs(c.getPickup() - c.getDrop()) * 15;

        int amount = calculateFare(travelDistance);

        int travelTime =
                Math.abs(c.getPickup() - c.getDrop());

        int dropTime =
                c.getTime() + travelTime;

        Booking b = new Booking(
                bookingId++,
                selectedTaxi.getId(),
                c.getPickup(),
                c.getDrop(),
                c.getTime(),
                dropTime,
                amount
        );

        selectedTaxi.addBooking(b);

        System.out.println("Taxi " + selectedTaxi.getId() + " Booked");
    }

    private int calculateFare(int km) {

        if (km <= 5)
            return 100;

        return 100 + (km - 5) * 10;
    }

    @Override
    public void displayTaxiDetails() {

        for (Taxi t : taxis) {

            System.out.println("\nTaxi " + t.getId()
                    + " Total Earnings: " + t.getEarnings());

            for (Booking b : t.getBookings()) {
                b.display();
            }
        }
    }
}