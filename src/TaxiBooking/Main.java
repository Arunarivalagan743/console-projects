package TaxiBooking;

import TaxiBooking.Model.Customer;
import TaxiBooking.Service.TaxiService;
import TaxiBooking.Service.TaxiServiceImpl;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaxiService service = new TaxiServiceImpl(4);

        while (true) {

            System.out.println("\n1. Book Taxi");
            System.out.println("2. Display Taxi Details");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Customer ID: ");
                    int id = sc.nextInt();

                    System.out.print("Pickup (A-F): ");
                    char pickup = sc.next().toUpperCase().charAt(0);

                    System.out.print("Drop (A-F): ");
                    char drop = sc.next().toUpperCase().charAt(0);

                    System.out.print("Time: ");
                    int time = sc.nextInt();

                    Customer c = new Customer(id, pickup, drop, time);
                    service.bookTaxi(c);
                    break;

                case 2:
                    service.displayTaxiDetails();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}