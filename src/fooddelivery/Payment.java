package fooddelivery;

public final class Payment {
    private final int paymentId;
    private final int orderId;
    private final double amount;
    private final String status;

    public Payment(int paymentId, int orderId, double amount, String status) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
