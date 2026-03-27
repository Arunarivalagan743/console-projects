package fooddelivery;

public final class DeliveryBoy extends User {
    private String status;
    private final float rating;

    public DeliveryBoy(int userId, String name, String phone, String status, float rating) {
        super(userId, name, phone);
        this.status = status;
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public float getRating() {
        return rating;
    }

    public void acceptOrder(Order order) {
        this.status = "ON_DELIVERY";
        order.updateStatus("PICKUP_ASSIGNED");
    }

    public void pickOrder(Order order) {
        order.updateStatus("OUT_FOR_DELIVERY");
    }

    public void completeDelivery(Order order) {
        this.status = "AVAILABLE";
        order.updateStatus("DELIVERED");
    }
}
