package HabitTracking.Service;

import HabitTracking.Main;
import HabitTracking.Model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserService {
    private Map<String, User> userStore  =  new HashMap<>();
    private  int idCounter  =1;

    public User registerUser(String name,String email,String password,int age)
    {
        if(userStore.containsKey(email))
        {

            return null;
        }
        User user =  new User(idCounter++,name,email,password,age);
        userStore.put(email,user);

          return user;
    }
    public User login(String email,String password)
    {
        User loginUser =  userStore.get(email);
        if(loginUser ==null)
        {
            return null;
        }
        else{
            if(!Objects.equals(loginUser.getPassword(), password))
            {
                System.out.println("Please check passowrd");
                return  null;
            }

        }
        return loginUser;


    }
    public void getAllUsers()
    {
        for (User user : userStore.values())
        {
            System.out.println("----------------------");
            System.out.println("ID: " + user.getUserId());
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
        }
    }

}
