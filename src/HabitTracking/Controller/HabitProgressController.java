package HabitTracking.Controller;

import HabitTracking.Model.Habit;
import HabitTracking.Model.HabitProgress;
import HabitTracking.Model.User;
import HabitTracking.Model.UserHabit;
import HabitTracking.Service.HabitProgressService;

import java.util.Scanner;

public class HabitProgressController {
    private Scanner scan;
    private HabitProgressService habitProgress;

    public HabitProgressController(Scanner scan)
    {
        this.scan= scan;
        this.habitProgress =  new HabitProgressService();
    }
    public void markHabit(User user
                          ,UserHabit userHabit)
    {
        System.out.println("Mark habit");
        System.out.println("Enter a notes");
        String notes =  scan.nextLine();
        habitProgress.markComplete(user,userHabit,notes);
        System.out.println("Habit marked complete! +10 points");
        if(habitProgress.isCompleted(userHabit))
        {
            System.out.println("Goal Achieved! Bonus +100 points!");
            user.earnPoints(100);
            userHabit.updateStatus("COMPLETED");
        }
    }

}
