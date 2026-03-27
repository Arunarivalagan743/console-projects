package travelplanner;

public class Profile {
    private final int profileId;
    private String preferences;
    private String travelHistory;

    public Profile(int profileId, String preferences, String travelHistory) {
        this.profileId = profileId;
        this.preferences = preferences;
        this.travelHistory = travelHistory;
    }

    public int getProfileId() {
        return profileId;
    }

    public String getPreferences() {
        return preferences;
    }

    public String getTravelHistory() {
        return travelHistory;
    }

    public void updatePreferences(String preferences) {
        this.preferences = preferences;
    }
}
