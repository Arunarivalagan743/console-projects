package HabitTracking.Model;


public abstract class Reward {

    protected int rewardId;
    protected int pointsRequired;

    public Reward(int rewardId, int pointsRequired) {
        this.rewardId = rewardId;
        this.pointsRequired = pointsRequired;
    }

    public int getPointsRequired() {
        return pointsRequired;
    }

    public abstract String getRewardType();
}