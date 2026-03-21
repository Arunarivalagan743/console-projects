package HabitTracking.Model;


import java.util.HashSet;
import java.util.Set;

public class Community {

    private int communityId;
    private String name;
    private String description;
    private int ownerId;
    private Set<Integer> members;

    public Community(int communityId, String name, String description, int ownerId) {
        this.communityId = communityId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.members = new HashSet<>();

        members.add(ownerId);
    }

    public int getCommunityId() { return communityId; }
    public String getName() { return name; }
    public String getDescription() { return description; }

    public boolean isMember(int userId) {
        return members.contains(userId);
    }

    public void addMember(int userId) {
        members.add(userId);
    }

    public int getOwnerId() {
        return ownerId;
    }
}