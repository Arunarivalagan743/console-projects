package HabitTracking.Model;

import java.time.LocalDate;

public class UserHabit {
    private  int userHabitId;
    private  int userId;
    private  int habitId;
    private LocalDate startDate;
    private  String frequency;
    private int goalTarget;
    private  String status;

    public UserHabit(int userHabitId, int userId, int habitId, LocalDate startDate, String frequency, int goalTarget) {
        this.userHabitId = userHabitId;
        this.userId = userId;
        this.habitId = habitId;
        this.startDate = startDate;
        this.frequency = frequency;
        this.goalTarget = goalTarget;
        this.status = "ACTIVE";
    }
    public int getUserHabitId() { return userHabitId; }
    public int getUserId() { return userId; }
    public int getHabitId() { return habitId; }
    public String getFrequency() { return frequency; }
    public int getGoalTarget() { return goalTarget; }
    public String getStatus() { return status; }

    public void updateStatus(String status) {
        this.status = status;
    }
}
