package fooddelivery;

import java.util.ArrayList;
import java.util.List;

public final class Customer extends User {
    private final String email;
    private final List<Address> addresses = new ArrayList<>();
    private final List<Offer> offers = new ArrayList<>();
    private final List<Rating> ratingsGiven = new ArrayList<>();

    public Customer(int userId, String name, String phone, String email) {
        super(userId, name, phone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
    }

    public void addToCart() {
        ensureLoggedIn("Customer must be logged in to add to cart");
    }

    public void placeOrder(Order order) {
        ensureLoggedIn("Customer must be logged in to place an order");
        order.updateStatus("PLACED");
    }

    public void makePayment(Payment payment) {
        ensureLoggedIn("Customer must be logged in to make payment");
        if (!"SUCCESS".equalsIgnoreCase(payment.getStatus())) {
            throw new IllegalStateException("Payment failed");
        }
    }

    public void trackOrder(Order order) {
        ensureLoggedIn("Customer must be logged in to track order");
        System.out.println("Tracking order #" + order.getOrderId() + " => " + order.getStatus());
    }

    public void giveRating(Rating rating) {
        ensureLoggedIn("Customer must be logged in to give rating");
        ratingsGiven.add(rating);
    }

    private void ensureLoggedIn(String message) {
        if (!isLoggedIn()) {
            throw new IllegalStateException(message);
        }
    }
}
