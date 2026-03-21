package HabitTracking.Controller;


import HabitTracking.Model.User;
import HabitTracking.Service.RewardService;

import java.util.Scanner;

public class RewardController {

    private RewardService rewardService;

    public RewardController() {
        this.rewardService = new RewardService();
    }

    public void checkRewards(User user) {
        rewardService.checkAndGiveReward(user);
    }

    public void showRewards(User user) {
        rewardService.showUserRewards(user.getUserId());
    }
}