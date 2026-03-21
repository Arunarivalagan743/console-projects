package HabitTracking.Service;

import HabitTracking.Model.Habit;
import HabitTracking.Model.HabitProgress;
import HabitTracking.Model.User;
import HabitTracking.Model.UserHabit;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HabitProgressService {
    private Map<Integer , HabitProgress>  habitProgressStore =  new HashMap<>();
    private int   progressIdCounter = 1;



    public HabitProgress markComplete(User user, UserHabit userHabit, String notes)
    {
        HabitProgress habitProgress = new HabitProgress(progressIdCounter++,user.getUserId(), LocalDate.now(),"Completed",notes);
        habitProgressStore.put(habitProgress.getProgressId(),habitProgress);
        user.earnPoints(10);
        return habitProgress;

    }
    public  boolean isCompleted(UserHabit userHabit)
    {
        int countComplted = count(userHabit.getUserHabitId());
        return countComplted >= userHabit.getGoalTarget();
    }

    private int count(int userHabitId) {
        int count =0;
        for (HabitProgress hp : habitProgressStore.values())
        {
            if(userHabitId == hp.getUserHabitId() && hp.getStatus().equals("Completed"))
            {
                count++;
            }
        }
        return count;
    }

}
