package fooddelivery;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Demo {

    private Demo() {
    }

    public static void run() {
        Customer customer = new Customer(1, "Aarav", "9000011111", "aarav@example.com");
        Restaurant restaurant = new Restaurant(2, "Spice Hub", "9000022222", "MG Road, Bengaluru");
        DeliveryBoy deliveryBoy = new DeliveryBoy(3, "Rohan", "9000033333", "AVAILABLE", 4.8f);

        customer.login();
        restaurant.login();
        deliveryBoy.login();

        Address homeAddress = new Address(9000, customer.getUserId(), "560001", "Bengaluru");
        customer.addAddress(homeAddress);

        restaurant.addMenuItem(new MenuItem(200, restaurant.getUserId(), "Paneer Roll", 120.0));
        restaurant.addMenuItem(new MenuItem(201, restaurant.getUserId(), "Veg Burger", 150.0));
        restaurant.addMenuItem(new MenuItem(202, restaurant.getUserId(), "Mango Shake", 90.0));

        Offer offer = new Offer(4000, customer.getUserId(), "WELCOME50", 50.0);
        customer.addOffer(offer);

        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        RatingService ratingService = new RatingService();

        Map<Integer, Integer> cartItems = new LinkedHashMap<>();
        cartItems.put(restaurant.getMenu().get(0).getItemId(), 2);
        cartItems.put(restaurant.getMenu().get(2).getItemId(), 1);

        customer.addToCart();

        Order order = orderService.createOrder(customer, restaurant, cartItems);
        order.applyDiscount(offer.getDiscount());

        customer.placeOrder(order);
        restaurant.confirmOrder(order);
        restaurant.prepareOrder(order);
        restaurant.markOrderReady(order);

        orderService.assignDelivery(order, deliveryBoy);
        deliveryBoy.acceptOrder(order);
        deliveryBoy.pickOrder(order);

        Payment payment = paymentService.processPayment(order, "SUCCESS");
        customer.makePayment(payment);

        deliveryBoy.completeDelivery(order);
        customer.trackOrder(order);

        Rating customerToDelivery = ratingService.submitRating(
                order,
                customer.getUserId(),
                deliveryBoy.getUserId(),
                5,
                "Quick and polite delivery",
                "DELIVERY_SERVICE"
        );

        Rating customerToRestaurant = ratingService.submitRating(
                order,
                customer.getUserId(),
                restaurant.getUserId(),
                4,
                "Food quality was good",
                "RESTAURANT_SERVICE"
        );

        customer.giveRating(customerToDelivery);
        customer.giveRating(customerToRestaurant);

        Report report = Report.analyzeByPincode(
            8000,
                "560001",
                "CITY_SUMMARY",
                List.of(customer),
                List.of(restaurant),
                List.of(deliveryBoy)
        );

        printSummary(customer, restaurant, deliveryBoy, order, payment, report);

        customer.logout();
        restaurant.logout();
        deliveryBoy.logout();
    }

    private static void printSummary(
            Customer customer,
            Restaurant restaurant,
            DeliveryBoy deliveryBoy,
            Order order,
            Payment payment,
            Report report
    ) {

        System.out.println(" FOOD DELIVERY" +
                "");

        System.out.println("Customer    : " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Restaurant  : " + restaurant.getName() + restaurant.getLocation());
        System.out.println("DeliveryBoy : " + deliveryBoy.getName() + " | Rating: " + deliveryBoy.getRating());

        System.out.println("Order ID    : " + order.getOrderId());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Items:");
        for (OrderItem item : order.getItems()) {
            System.out.printf("- %s x%d = %.2f%n", item.getItemName(), item.getQuantity(), item.getPrice());
        }
        System.out.printf("Total Price : %.2f%n", order.getTotalPrice());
        System.out.println("Payment     : " + payment.getStatus() + " | Amount: " + payment.getAmount());

        System.out.println("Report      : " + report.getType() + " for pincode " + report.getPincode());
        System.out.println("Insights    : " + report.getSummary());
        System.out.println("GeneratedAt : " + report.getGeneratedAt());

    }
}
