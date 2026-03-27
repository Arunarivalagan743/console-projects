package fooddelivery;

public final class Rating {
    private final int ratingId;
    private final int orderId;
    private final int fromUserId;
    private final int toUserId;
    private final int rating;
    private final String feedback;
    private final String type;

    public Rating(int ratingId, int orderId, int fromUserId, int toUserId, int rating, String feedback, String type) {
        this.ratingId = ratingId;
        this.orderId = orderId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.rating = rating;
        this.feedback = feedback;
        this.type = type;
    }

    public int getRatingId() {
        return ratingId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public int getRating() {
        return rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getType() {
        return type;
    }
}
