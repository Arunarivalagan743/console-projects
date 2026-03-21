package HabitTracking.Service;


import HabitTracking.Model.*;

import java.util.*;

public class RewardService {

    private List<Reward> rewards = new ArrayList<>();
    private List<UserReward> userRewards = new ArrayList<>();
    private int idCounter = 1;

    public RewardService() {


        rewards.add(new BadgeReward(1, 100, "Bronze"));
        rewards.add(new BadgeReward(2, 300, "Silver"));
        rewards.add(new BadgeReward(3, 500, "Gold"));
       ;
    }

    public void checkAndGiveReward(User user) {

        for (Reward reward : rewards) {

            if (user.getTotalPoints() >= reward.getPointsRequired()) {

                boolean alreadyGiven = false;

                for (UserReward ur : userRewards) {
                    if (ur.getRewardType().equals(reward.getRewardType())
                            && ur.getRewardType().contains(user.getName())) {
                        alreadyGiven = true;
                    }
                }

                if (!alreadyGiven) {
                    UserReward userReward = new UserReward(
                            idCounter++,
                            user.getUserId(),
                            reward.getRewardType()
                    );

                    userRewards.add(userReward);

                    System.out.println("Reward Unlocked: " + reward.getRewardType());
                }
            }
        }
    }

    public void showUserRewards(int userId) {

        System.out.println("\n--- YOUR REWARDS ---");

        for (UserReward ur : userRewards) {
            if (ur.getRewardType() != null) {
                System.out.println(ur.getRewardType());
            }
        }
    }
}