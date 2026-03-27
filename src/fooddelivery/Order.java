package fooddelivery;

import java.util.ArrayList;
import java.util.List;

public final class Order {
    private final int orderId;
    private final int customerId;
    private final int restaurantId;
    private Integer deliveryId;
    private String status;
    private double totalPrice;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(int orderId, int customerId, int restaurantId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.status = "CREATED";
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addOrderItem(OrderItem orderItem) {
        items.add(orderItem);
        calculateTotal();
    }

    public void calculateTotal() {
        totalPrice = items.stream().mapToDouble(OrderItem::getPrice).sum();
    }

    public void applyDiscount(double discount) {
        totalPrice = Math.max(0, totalPrice - discount);
    }

    public void assignDeliveryBoy(DeliveryBoy deliveryBoy) {
        this.deliveryId = deliveryBoy.getUserId();
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void cancelOrder() {
        this.status = "CANCELLED";
    }
}
