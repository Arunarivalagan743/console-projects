package HabitTracking.Service;

import HabitTracking.Model.UserHabit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserHabitService {
    private Map<Integer , UserHabit> userHabitStore =  new HashMap<>();
    private  int userHabitId = 1;

public  UserHabit assignHabit(int userId,int habitId,String frequncy,int goalTarget)
    {
        UserHabit userHabit =  new UserHabit(
                userHabitId++,
                userId,habitId,
                LocalDate.now(),
                frequncy,
                goalTarget
        );
        userHabitStore.put(userHabit.getUserHabitId(),userHabit);
        return  userHabit;

    }
    public List<UserHabit> getHabitByUserID(int userId)
    {
        List <UserHabit> userHabitList =  new ArrayList<>();
        for(UserHabit uh : userHabitStore.values())
        {
            if(uh.getUserId() == userId)
            {
                userHabitList.add(uh);
            }
        }
        return  userHabitList;

    }

    public UserHabit getUserHabitById(int id) {
        return userHabitStore.get(id);
    }
}
