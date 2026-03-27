package travelplanner;

public class UserService {

    public void registerUser(User user) {
        user.register();
    }

    public void loginUser(User user) {
        user.login();
    }

    public void updateUserProfile(User user, Profile profile) {
        user.updateProfile(profile);
    }
}
