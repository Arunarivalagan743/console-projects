package HabitTracking.Model;

import java.time.LocalDate;

public class HabitProgress {
    private  int progressId;
    private  int userHabitId;
    private LocalDate completedDate;
    private  String status;
    private  String notes;

    public HabitProgress(int progressId, int userHabitId, LocalDate completedDate, String status, String notes) {
        this.progressId = progressId;
        this.userHabitId = userHabitId;
        this.completedDate = completedDate;
        this.status = status;
        this.notes = notes;
    }

    public int getProgressId() {
        return progressId;
    }

    public int getUserHabitId() {
        return userHabitId;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }
}
