package HabitTracking;


import HabitTracking.Controller.UserController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HabitTracking.Controller.UserController controller = new UserController(scan);

        controller.initialize();
        controller.startApp();
    }
}