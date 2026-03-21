package HabitTracking.Model;

public class Habit {
    private  int habitId;
    private String habitName;
    private String description;
    private  String category;
    private String defaultFrequency;

    public Habit(int habitId, String habitName, String description, String category, String defaultFrequency) {
        this.habitId = habitId;
        this.habitName = habitName;
        this.description = description;
        this.category = category;
        this.defaultFrequency = defaultFrequency;
    }

    public int getHabitId() {
        return habitId;
    }

    public String getHabitName() {
        return habitName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getDefaultFrequency() {
        return defaultFrequency;
    }

    public void updateHabit(String habitName,String description) {
        this.habitName = habitName;
        this.description = description;
    }
}
