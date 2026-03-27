package travelplanner;

public class Review {
    private final int reviewId;
    private final int userId;
    private final int destinationId;
    private int rating;
    private String comment;

    public Review(int reviewId, int userId, int destinationId, int rating, String comment) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.destinationId = destinationId;
        this.rating = rating;
        this.comment = comment;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void submitReview() {
        System.out.println("Review submitted: " + rating + "/5 - " + comment);
    }

    public void editReview(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }
}
