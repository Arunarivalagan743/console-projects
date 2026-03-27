package fooddelivery;

public final class PaymentService {
    private int nextPaymentId = 7000;

    public PaymentService() {
    }

    public Payment processPayment(Order order, String status) {
        Payment payment = new Payment(nextPaymentId++, order.getOrderId(), order.getTotalPrice(), status);
        if ("SUCCESS".equalsIgnoreCase(status)) {
            order.updateStatus("PAID");
        }
        return payment;
    }
}
