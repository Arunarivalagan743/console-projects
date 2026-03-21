package HabitTracking.Controller;

import HabitTracking.Model.Habit;
import HabitTracking.Service.HabitService;

import java.util.Scanner;

public class HabitController {
    private Scanner scan;
    private HabitService habitService;

    public HabitController(Scanner scan)
    {
        this.scan =  scan;
        this.habitService =  new HabitService();
    }
    public  void habitMenu()
    {
        while (true)
        {
            System.out.println("\n--- HABIT MENU ---");
            System.out.println("1. Create Habit");
            System.out.println("2. View All Habits");
            System.out.println("3. Back");
            int choice =  Integer.parseInt(scan.nextLine());
            switch (choice)
            {
                case 1 :
                    createHabit();
                    break;
                case  2:
                    viewAllHabits();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void  createHabit()
    {
        System.out.println("\n--- CREATE HABIT ---");

        System.out.print("Enter Habit Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Description: ");
        String description = scan.nextLine();

        System.out.print("Enter Category: ");
        String category = scan.nextLine();

        System.out.print("Enter Frequency (Daily/Weekly): ");
        String frequency = scan.nextLine();
         Habit habit =  habitService.createHabit(name,description,category,frequency);
        System.out.println("Habit created! ID: " + habit.getHabitId());

    }
    public  void viewAllHabits()
    {
        System.out.println("All  habits");
        for (Habit habit  : habitService.getAllHabits())
        {
            System.out.println("-------------------");
            System.out.println("ID: " + habit.getHabitId());
            System.out.println("Name: " + habit.getHabitName());
            System.out.println("Category: " + habit.getCategory());
            System.out.println("Frequency: " + habit.getDefaultFrequency());
        }
    }
}
