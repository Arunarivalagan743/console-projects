package HabitTracking.Model;

import java.time.LocalDate;

public class UserReward {

    private int userRewardId;
    private int userId;
    private String rewardType;
    private LocalDate earnedDate;

    public UserReward(int userRewardId, int userId, String rewardType) {
        this.userRewardId = userRewardId;
        this.userId = userId;
        this.rewardType = rewardType;
        this.earnedDate = LocalDate.now();
    }

    public String getRewardType() {
        return rewardType;
    }
}
