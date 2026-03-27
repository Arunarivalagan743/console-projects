package travelplanner;

public class ReviewService {

    public void addReview(User user, Destination destination, Review review) {
        if (review.getUserId() != user.getUserId() || review.getDestinationId() != destination.getDestinationId()) {
            throw new IllegalArgumentException("Review mapping with user or destination is invalid.");
        }
        review.submitReview();
    }
}
