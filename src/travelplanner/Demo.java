package travelplanner;

import java.time.LocalDate;
import java.time.LocalTime;

public final class Demo {

    private Demo() {
    }

    public static void run() {
        User user = new User(1, "Aarav", "aarav@example.com", "secret@123");
        Profile profile = new Profile(10, "Beach, food, budget stays", "Goa, Jaipur");
        Destination destination = new Destination(
                100,
                "Bali",
                "Indonesia",
                "Island h beaches and temples",
                "Tropical"
        );

        Accommodation accommodation = new Accommodation(200, "Ocean View Stay", "Kuta", 3500.0f);
        Transport transport = new Transport(300, "Flight", "Bengaluru", "Denpasar", 28000.0f);

        UserService userService = new UserService();
        ItineraryService itineraryService = new ItineraryService();
        BookingService bookingService = new BookingService();
        BudgetService budgetService = new BudgetService();
        ReviewService reviewService = new ReviewService();

        userService.registerUser(user);
        userService.loginUser(user);
        userService.updateUserProfile(user, profile);

        Itinerary itinerary = itineraryService.createItinerary(
                user,
                destination,
                500,
                "Bi Summer Escape",
                LocalDate.of(2026, 6, 10),
                LocalDate.of(2026, 6, 15)
        );

        ItineraryItem day1 = new ItineraryItem(
                1,
                "Temple Visit",
                "Vih Lot Temple",
                LocalDate.of(2026, 6, 11),
                LocalTime.of(10, 0)
        );

        ItineraryItem day2 = new ItineraryItem(
                2,
                "Beach Sunset",
                "Evening at S Beach",
                LocalDate.of(2026, 6, 12),
                LocalTime.of(17, 30)
        );

        itineraryService.addItem(itinerary, day1);
        itineraryService.addItem(itinerary, day2);

        Booking stayBooking = bookingService.createBooking(user, accommodation, 7001);
        Booking travelBooking = bookingService.createTransportBooking(user, transport, 7002);

        Budget budget = new Budget(800, user.getUserId(), 100000.0f);
        Expense flightExpense = new Expense(9001, transport.getPrice(), "Travel", LocalDate.of(2026, 5, 1));
        Expense hotelExpense = new Expense(9002, accommodation.getPrice() * 5, "Stay", LocalDate.of(2026, 5, 2));

        budgetService.addExpense(budget, flightExpense);
        budgetService.addExpense(budget, hotelExpense);

        Review review = new Review(10001, user.getUserId(), destination.getDestinationId(), 5, "Perfect place for a relaxed trip.");
        reviewService.addReview(user, destination, review);

        printSummary(user, destination, itinerary, stayBooking, travelBooking, budget, budgetService.trackExpenses(budget));
    }

    private static void printSummary(
            User user,
            Destination destination,
            Itinerary itinerary,
            Booking stayBooking,
            Booking travelBooking,
            Budget budget,
            String budgetSummary
    ) {

        System.out.println(" TRAVE");

        System.out.println("User          : " + user.getName() + " (" + user.getEmail() + ")");
        System.out.println("Destination   : " + destination.getDetails());
        System.out.println("Itinerary     : " + itinerary.getName() + " [" + itinerary.getStartDate() + " to " + itinerary.getEndDate() + "]");


        System.out.println("Itinerary Items:");
        for (ItineraryItem item : itinerary.getItems()) {
            System.out.println("- " + item.getDate() + " " + item.getTime() + " | " + item.getItemName() + " - " + item.getDescription());
        }


        System.out.println("Stay Booking  : " + stayBooking.getType() + " #" + stayBooking.getReferenceId() + " | " + stayBooking.getStatus());
        System.out.println("Travel Booking: " + travelBooking.getType() + " #" + travelBooking.getReferenceId() + " | " + travelBooking.getStatus());
        System.out.println("Budget Total  : " + budget.getTotalBudget());
        System.out.println("Budget Status : " + budgetSummary);

    }
}
