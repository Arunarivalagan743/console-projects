package HabitTracking.Service;

import HabitTracking.Model.Habit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HabitService {
    private Map<Integer , Habit> habitStore = new HashMap<>();
    private  int idCounter = 1;

    public  Habit createHabit(String name,String description,String category,String defaultFrequency)
    {
        Habit habit =  new Habit(idCounter++,name,description,category,defaultFrequency);
        habitStore.put(habit.getHabitId(),habit);
        return  habit;
    }
    public Collection<Habit> getAllHabits()
    {
        return  habitStore.values();
    }
    public Habit getHabitById(int habitId)
    {
        return  habitStore.get(habitId);
    }

}
