package Fodd.Service;

import Fodd.Model.Customer;

import java.util.List;
import java.util.Map;

public class AuthService {

    public Customer login(List <Customer> customerList,String email,String password)
    {
        for(Customer c : customerList )
        {
            if(c.getEmail().equals(email) && c.getPassword().equals(password))
            {
                return c;
            }
        }
        return  null;
    }
}
