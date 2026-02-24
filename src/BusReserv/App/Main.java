    package BusReserv.App;

    import BusReserv.Model.Booking;
    import BusReserv.Model.Bus;
    import BusReserv.Model.Passenger;
    import BusReserv.Service.Booking.BookingService;
    import BusReserv.Service.Booking.BusBookingService;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws ParseException {
            Scanner  sc = new Scanner(System.in);
            int userOpt =  1;
            System.out.println("Welcome to Buzzarev");
            ArrayList<Bus> busList =  new ArrayList<>();
            ArrayList <Passenger> passengerList = new ArrayList<>();
            ArrayList <Booking> bookingList  =  new ArrayList<>();
            BusBookingService bookingService =
                    new BusBookingService(busList);
            busList.add(new Bus("SETC", "Erode-Salem", "Salem", 2));
            busList.add(new Bus("TNSTC", "Tirupur-Coimbatore", "Coimbatore", 40));
            for(Bus b : busList)
            {
                b.displayBus();
            }
            while (true) {

                System.out.println("\nSelect Option...");
                System.out.println("1. Book Ticket");
                System.out.println("2. Admin Panel");
                System.out.println("3. Exit");

                userOpt = sc.nextInt();

                if (userOpt == 1) {

                    System.out.println("Booking Started...");

                    System.out.print("Enter your name: ");
                    String name = sc.next();

                    System.out.print("Enter your destination: ");
                    String dest = sc.next();

                    System.out.print("Enter date (dd-MM-yyyy): ");
                    String dateInput = sc.next();

                    SimpleDateFormat sdf =
                            new SimpleDateFormat("dd-MM-yyyy");

                    Date date = sdf.parse(dateInput);

                    Passenger passenger =
                            new Passenger(name, dest, date);

                    Bus bookedBus =
                            bookingService.bookTicket(passenger);

                    if (bookedBus != null) {

                        passengerList.add(passenger);

                        Booking booking = new Booking(
                                passenger.getName(),
                                bookedBus.getBusName(),
                                bookedBus.getPath(),
                                200.0,
                                passenger.getDestination()
                        );

                        bookingList.add(booking);

                        System.out.println("Booking Saved Successfully");
                    }
                }


                else if (userOpt == 2) {

                    System.out.print("Enter admin password: ");
                    String pass = sc.next();

                    if (!pass.equals("admin123")) {
                        System.out.println("Wrong Password");
                        continue;
                    }

                    System.out.println("\n1. View Passenger List");
                    System.out.println("2. View Booking List");

                    int adminOpt = sc.nextInt();

                    if (adminOpt == 1) {

                        if (passengerList.isEmpty()) {
                            System.out.println("No passengers");
                        } else {
                            for (Passenger p : passengerList) {
                                System.out.println(
                                        p.getName() + " | " +
                                                p.getDestination() +
                                                " | Booked Date: " +
                                                p.getDate()
                                );
                            }
                        }
                    }

                    else if (adminOpt == 2) {

                        if (bookingList.isEmpty()) {
                            System.out.println("No bookings");
                        } else {
                            for (Booking b : bookingList) {
                                b.displayBokking();
                            }
                        }
                    }

                    else {
                        System.out.println("Invalid Admin Option");
                    }
                }


                else if (userOpt == 3) {
                    System.out.println("exiting...");
                    break;
                }

                else {
                    System.out.println("Invalid Option");
                }
            }

                }

                }



