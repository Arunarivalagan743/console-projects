package HabitTracking.Controller;


import HabitTracking.Model.Journal;
import HabitTracking.Service.JournalService;

import java.util.List;
import java.util.Scanner;

public class JournalController {

    private Scanner scan;
    private JournalService journalService;

    public JournalController(Scanner scan) {
        this.scan = scan;
        this.journalService = new JournalService();
    }

    public void addJournal(int userId) {

        System.out.println("\n--- ADD JOURNAL ---");

        System.out.print("Enter Mood: ");
        String mood = scan.nextLine();

        System.out.print("Enter Notes: ");
        String notes = scan.nextLine();

        journalService.addEntry(userId, mood, notes);

        System.out.println("Journal saved!");
    }

    public void viewJournals(int userId) {

        System.out.println("\n--- YOUR JOURNALS ---");

        List<Journal> list = journalService.getUserJournals(userId);

        if (list.isEmpty()) {
            System.out.println("No journal entries.");
            return;
        }

        for (Journal j : list) {
            System.out.println("------------------");
            System.out.println("Mood: " + j.getMood());
            System.out.println("Notes: " + j.getNotes());
        }
    }
    public void deleteJournal(int userId) {

        System.out.print("Enter Journal ID: ");
        int id = Integer.parseInt(scan.nextLine());

        if (journalService.deleteJournal(userId, id)) {
            System.out.println("Journal deleted");
        }
    }
}