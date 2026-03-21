    package HabitTracking.Controller;

    import HabitTracking.Model.User;
    import HabitTracking.Model.UserHabit;
    import HabitTracking.Model.UserReward;
    import HabitTracking.Service.HabitProgressService;
    import HabitTracking.Service.UserService;

    import java.util.Scanner;

    public class UserController {
        private Scanner scan;
        private UserService userService;
        private HabitController habitController;
        private UserHabitController userHabitController;
        private  HabitProgressController habitProgressController;
        private RewardController rewardController;
        private JournalController journalController;
        private CommunityController communityController;

        public UserController(Scanner scan)
        {
            this.scan =  scan;
            this.userService =  new UserService();
            this.habitController = new HabitController(scan);
            this.userHabitController =  new UserHabitController(scan);
            this.habitProgressController =  new HabitProgressController(scan);
            this.rewardController =  new RewardController();
            this.journalController = new JournalController(scan);
            this.communityController = new CommunityController(scan);
        }

        public void initialize() {
            System.out.println("System Initialized...");
        }
        public void startApp() {

            System.out.println("\nWelcome to Habit Tracker Application");

            while (true)
            {
                System.out.println("\n1. Login");
                System.out.println("2.Signup");

                System.out.println("3.Exit");
                System.out.println("4.Display all users");

                int choice = Integer.parseInt(scan.nextLine());

                switch (choice)
                {
                    case 1 :
                        login();
                        break;
                     case 2 :
                         signup();
                         break;
                    case 3:
                        System.out.println("Exitingg....");
                        return;
                    case 4:
                        displayUsers();
                        break;
                    default:
                        System.out.println("Invalis choice..");
                }
            }
        }

        private void displayUsers() {
            userService.getAllUsers();
        }

        public void signup()
        {
            System.out.println("\n---  SIGN UP ---");

            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            System.out.println("Enter age:");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter a email:");
            String email = scan.nextLine();
            System.out.println("Enter a password: ");
            String password = scan.nextLine();

            User user =  userService.registerUser(name,email,password,age);
            if (user == null) {
                System.out.println("User already exists with this email!");
            } else {
                System.out.println("Signup successful! Your User ID: " + user.getUserId());
            }

        }
        public void login() {

            System.out.println("\n--- LOGIN ---");

            System.out.print("Enter Email: ");
            String email = scan.nextLine();

            System.out.print("Enter Password: ");
            String password = scan.nextLine();

            User user = userService.login(email, password);

            if (user == null) {
                System.out.println("Invalid credentials!");
            } else {
                System.out.println("Login successful! Welcome " + user.getName());
                userDashboard(user);
            }
        }

        private void userDashboard(User user) {
            while (true)
            {
                System.out.println("User dashbaord");
                System.out.println("1.Manage Habits");
                System.out.println("2.Assign Habit");
                System.out.println("3.Mark Habit");
                System.out.println("4.My Habits");
                System.out.println("5. View Rewards");
                System.out.println("6. Add Journal");
                System.out.println("7. View Journal");
                System.out.println("8. Delete Journal");
                System.out.println("9. Community");
                System.out.println("10. Logout");
                int choice = Integer.parseInt(scan.nextLine());
                switch (choice)
                {
                    case 1:
                        habitController.habitMenu();
                        break;
                    case 2:
                        userHabitController.assignHabit(user.getUserId());
                        break;
                    case 3:
                        System.out.print("Enter UserHabit ID: ");
                        int uhId = Integer.parseInt(scan.nextLine());

                        UserHabit userHabit = userHabitController.getUserHabit(uhId);

                        if (userHabit == null) {
                            System.out.println("Invalid UserHabit ID");
                        } else {
                            habitProgressController.markHabit(user, userHabit);
                            rewardController.checkRewards(user);
                        }
                        break;
                    case 4:
                        userHabitController.viewUserHabits(user.getUserId());
                        break;
                    case 5:
                        rewardController.showRewards(user);
                        break;
                    case 6:
                        journalController.addJournal(user.getUserId());
                        break;

                    case 7:
                        journalController.viewJournals(user.getUserId());
                        break;
                    case 8 :
                        journalController.deleteJournal(user.getUserId());
                        break;
                    case 9:
                        communityController.communityMenu(user.getUserId());
                        break;

                    case 10:
                        return;
                    default:
                        System.out.println("invalid choice");
                }

            }
        }


    }
