package HabitTracking.Controller;

import HabitTracking.Model.UserHabit;
import HabitTracking.Service.UserHabitService;

import java.util.List;
import java.util.Scanner;

public class UserHabitController {
private Scanner scan;
private UserHabitService userHabitService;
public  UserHabitController(Scanner scan)
{
    this.scan =  scan;
    this.userHabitService = new UserHabitService();
}
public void assignHabit(int userId)
{
    System.out.println("Assign Habit");
    System.out.println("Enter a habitID");
    int habitId = scan.nextInt();
    scan.nextLine();
    System.out.print("Enter Frequency: ");
    String frequency = scan.nextLine();

    System.out.print("Enter Goal Target: ");
    int goal = Integer.parseInt(scan.nextLine());
    UserHabit userHabit =  userHabitService.assignHabit(userId,habitId,frequency,goal);
    System.out.println("Habit assigned! ID: " + userHabit.getUserHabitId());
}
    public void viewUserHabits(int userId) {

        System.out.println("\n--- YOUR HABITS ---");

        List<UserHabit> list = userHabitService.getHabitByUserID(userId);

        if (list.isEmpty()) {
            System.out.println("No habits assigned.");
            return;
        }

        for (UserHabit uh : list) {
            System.out.println("-------------------");
            System.out.println("UserHabit ID: " + uh.getUserHabitId());
            System.out.println("Habit ID: " + uh.getHabitId());
            System.out.println("Frequency: " + uh.getFrequency());
            System.out.println("Goal: " + uh.getGoalTarget());
            System.out.println("Status: " + uh.getStatus());
        }
    }
    public UserHabit getUserHabit(int id) {
        return userHabitService.getUserHabitById(id);
    }



}
