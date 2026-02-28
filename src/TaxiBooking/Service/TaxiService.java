package TaxiBooking.Service;



import TaxiBooking.Model.Booking;
import TaxiBooking.Model.Customer;
import TaxiBooking.Model.Taxi;

import java.util.ArrayList;
import java.util.List;

public interface TaxiService {

    void bookTaxi(Customer c);

    void displayTaxiDetails();



}