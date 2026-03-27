package fooddelivery;

public final class RatingService {
    private int nextRatingId = 3000;

    public RatingService() {
    }

    public Rating submitRating(
            Order order,
            int fromUserId,
            int toUserId,
            int rating,
            String feedback,
            String type
    ) {
        return new Rating(nextRatingId++, order.getOrderId(), fromUserId, toUserId, rating, feedback, type);
    }
}
