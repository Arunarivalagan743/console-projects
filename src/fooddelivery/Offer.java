package fooddelivery;

public final class Offer {
    private final int offerId;
    private final int customerId;
    private final String description;
    private final double discount;

    public Offer(int offerId, int customerId, String description, double discount) {
        this.offerId = offerId;
        this.customerId = customerId;
        this.description = description;
        this.discount = discount;
    }

    public int getOfferId() {
        return offerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }
}
