package HabitTracking.Model;



import java.time.LocalDate;

public class Journal {

    private int journalId;
    private int userId;
    private LocalDate entryDate;
    private String mood;
    private String notes;

    public Journal(int journalId, int userId, String mood, String notes) {
        this.journalId = journalId;
        this.userId = userId;
        this.entryDate = LocalDate.now();
        this.mood = mood;
        this.notes = notes;
    }

    public int getUserId() { return userId; }
    public String getMood() { return mood; }
    public String getNotes() { return notes; }
    public int getJournalId() { return journalId; }
}