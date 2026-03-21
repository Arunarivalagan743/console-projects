package HabitTracking.Service;

import HabitTracking.Model.*;

import java.util.*;

public class CommunityService {

    private Map<Integer, Community> communityStore = new HashMap<>();
    private List<CommunityPost> posts = new ArrayList<>();

    private int communityIdCounter = 1;
    private int postIdCounter = 1;

    public Community createCommunity(int userId, String name, String desc) {

        Community c = new Community(communityIdCounter++, name, desc, userId);
        communityStore.put(c.getCommunityId(), c);

        return c;
    }

    public Collection<Community> getAllCommunities() {
        return communityStore.values();
    }

    public boolean joinCommunity(int userId, int communityId) {

        Community c = communityStore.get(communityId);

        if (c == null) {
            System.out.println("Community not found!");
            return false;
        }

        c.addMember(userId);
        return true;
    }


    public boolean createPost(int userId, int communityId, String content) {

        Community c = communityStore.get(communityId);

        if (c == null) {
            System.out.println("Community not found!");
            return false;
        }

        if (!c.isMember(userId)) {
            System.out.println("Join community first!");
            return false;
        }

        posts.add(new CommunityPost(postIdCounter++, userId, communityId, content));
        return true;
    }

    public List<CommunityPost> getPostsByCommunity(int communityId) {

        List<CommunityPost> result = new ArrayList<>();

        for (CommunityPost p : posts) {
            if (p.getCommunityId() == communityId) {
                result.add(p);
            }
        }

        return result;
    }
    public List<CommunityPost> getPostsByCommunity(int userId, int communityId) {

        Community c = communityStore.get(communityId);

        if (c == null) {
            System.out.println("Community not found!");
            return new ArrayList<>();
        }


        if (!c.isMember(userId)) {
            System.out.println("Join community to view posts!");
            return new ArrayList<>();
        }

        List<CommunityPost> result = new ArrayList<>();

        for (CommunityPost p : posts) {
            if (p.getCommunityId() == communityId) {
                result.add(p);
            }
        }

        return result;
    }
    public boolean deleteCommunity(int userId, int communityId) {

        Community c = communityStore.get(communityId);

        if (c == null) {
            System.out.println("Community not found!");
            return false;
        }

        if (c.getOwnerId() != userId) {
            System.out.println("Only owner can delete this community");
            return false;
        }

        communityStore.remove(communityId);
        return true;
    }
    public boolean deletePost(int userId, int postId) {

        Iterator<CommunityPost> it = posts.iterator();

        while (it.hasNext()) {
            CommunityPost p = it.next();

            if (p.getPostId() == postId) {

                if (p.getUserId() != userId) {
                    System.out.println("You can delete only your post");
                    return false;
                }

                it.remove();
                return true;
            }
        }

        System.out.println("Post not found!");
        return false;
    }
}
