package travelplanner;

public class User {
    private final int userId;
    private final String name;
    private final String email;
    private final String password;
    private Profile profile;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void register() {
        System.out.println(name + " registered successfully.");
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void updateProfile(Profile profile) {
        this.profile = profile;
    }
}
