package fooddelivery;

public final class OrderItem {
    private final int orderItemId;
    private final int orderId;
    private final int itemId;
    private final String itemName;
    private final int quantity;
    private final double price;

    public OrderItem(int orderItemId, int orderId, int itemId, String itemName, int quantity, double unitPrice) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = unitPrice * quantity;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
