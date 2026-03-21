package HabitTracking.Model;

public class User {
    private int userId;
    private String name;
    private String email;
    private  String password;
    private  int age;
    private  int totalPoints;

    public User(int userId, String name, String email, String password, int age) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.totalPoints = 0;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
    public void earnPoints(int points)
    {
        this.totalPoints += points;
    }
}
