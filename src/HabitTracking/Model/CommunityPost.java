package HabitTracking.Model;



public class CommunityPost {

    private int postId;
    private int userId;
    private int communityId;
    private String content;

    public CommunityPost(int postId, int userId, int communityId, String content) {
        this.postId = postId;
        this.userId = userId;
        this.communityId = communityId;
        this.content = content;
    }

    public int getCommunityId() { return communityId; }
    public int getUserId() { return userId; }
    public String getContent() { return content; }
    public int getPostId() { return postId; }
}