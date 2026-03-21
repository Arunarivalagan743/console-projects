package HabitTracking.Controller;


import HabitTracking.Model.*;
import HabitTracking.Service.CommunityService;

import java.util.List;
import java.util.Scanner;

public class CommunityController {

    private Scanner scan;
    private CommunityService service;

    public CommunityController(Scanner scan) {
        this.scan = scan;
        this.service = new CommunityService();
    }

    public void communityMenu(int userId) {

        while (true) {
            System.out.println("\n--- COMMUNITY ---");
            System.out.println("1. Create");
            System.out.println("2. View Communities");
            System.out.println("3. Join");
            System.out.println("4. Post");
            System.out.println("5. View Posts");
            System.out.println("6. Delete community");
            System.out.println("7. Delete Post");
            System.out.println("8. Return");

            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    createCommunity(userId);
                    break;
                case 2:
                    viewCommunities();
                    break;
                case 3:
                    joinCommunity(userId);
                    break;
                case 4:
                    createPost(userId);
                    break;
                case 5:
                    viewPosts(userId);
                    break;

                case 6:
                    System.out.println("6. Delete Community");
                    deleteCommunity(userId);
                    break;
                case 7:
                    deletePost(userId);
                    break;
                case 8 :
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private void createCommunity(int userId) {

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Description: ");
        String desc = scan.nextLine();

        Community c = service.createCommunity(userId, name, desc);

        System.out.println("Created! ID: " + c.getCommunityId());
    }

    private void viewCommunities() {

        System.out.println("\n--- ALL COMMUNITIES ---");

        for (Community c : service.getAllCommunities()) {
            System.out.println("------------------");
            System.out.println("ID: " + c.getCommunityId());
            System.out.println("Name: " + c.getName());
        }
    }

    private void joinCommunity(int userId) {

        System.out.print("Enter Community ID: ");
        int id = Integer.parseInt(scan.nextLine());

        if (service.joinCommunity(userId, id)) {
            System.out.println("Joined!");
        }
    }

    private void createPost(int userId) {

        System.out.print("Community ID: ");
        int id = Integer.parseInt(scan.nextLine());

        System.out.print("Content: ");
        String content = scan.nextLine();

        if (service.createPost(userId, id, content)) {
            System.out.println("Post added!");
        }
    }

    private void viewPosts(int userId) {

        System.out.print("Enter Community ID: ");
        int id = Integer.parseInt(scan.nextLine());

        List<CommunityPost> posts = service.getPostsByCommunity(userId, id);

        if (posts.isEmpty()) {
            return;
        }

        System.out.println("\n--- POSTS ---");

        for (CommunityPost p : posts) {
            System.out.println("------------------");
            System.out.println("User: " + p.getUserId());
            System.out.println("Message: " + p.getContent());
        }
    }
    private void deleteCommunity(int userId) {

        System.out.print("Enter Community ID: ");
        int id = Integer.parseInt(scan.nextLine());

        if (service.deleteCommunity(userId, id)) {
            System.out.println("Community deleted");
        }
    }
    private void deletePost(int userId) {

        System.out.print("Enter Post ID: ");
        int id = Integer.parseInt(scan.nextLine());

        if (service.deletePost(userId, id)) {
            System.out.println("Post deleted");
        }
    }
}