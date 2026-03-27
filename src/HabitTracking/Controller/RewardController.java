package HabitTracking.Controller;


import HabitTracking.Model.User;

import HabitTracking.Service.RewardServiceStrategy;

import java.util.Scanner;

public class RewardController {

    private RewardServiceStrategy rewardService;

    public RewardController() {
        this.rewardService = new RewardServiceStrategy();
    }

    public void checkRewards(User user) {
        rewardService.checkAndGiveReward(user);
    }

    public void showRewards(User user) {
        rewardService.showUserRewards(user.getUserId());
    }
}