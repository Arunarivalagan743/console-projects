package HabitTracking.Model;


public class BadgeReward extends Reward {

    private String badgeName;

    public BadgeReward(int rewardId, int pointsRequired, String badgeName) {
        super(rewardId, pointsRequired);
        this.badgeName = badgeName;
    }

    @Override
    public String getRewardType() {
        return "Badge: " + badgeName;
    }
}