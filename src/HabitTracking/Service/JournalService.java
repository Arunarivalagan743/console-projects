package HabitTracking.Service;

import HabitTracking.Model.Journal;

import java.util.*;

public class JournalService {

    private List<Journal> journalList = new ArrayList<>();
    private int idCounter = 1;

    public Journal addEntry(int userId, String mood, String notes) {

        Journal journal = new Journal(idCounter++, userId, mood, notes);
        journalList.add(journal);

        return journal;
    }

    public List<Journal> getUserJournals(int userId) {

        List<Journal> result = new ArrayList<>();

        for (Journal j : journalList) {
            if (j.getUserId() == userId) {
                result.add(j);
            }
        }

        return result;
    }
    public boolean deleteJournal(int userId, int journalId) {

        Iterator<Journal> it = journalList.iterator();

        while (it.hasNext()) {
            Journal j = it.next();

            if (j.getJournalId() == journalId) {

                if (j.getUserId() != userId) {
                    System.out.println("Cannot delete others journal");
                    return false;
                }

                it.remove();
                return true;
            }
        }

        System.out.println("Journal not found!");
        return false;
    }
}