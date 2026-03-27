package Fodd.Service;

import Fodd.Model.Customer;
import Fodd.Model.FoodItem;
import Fodd.Model.Order;
import Fodd.Model.Restaurant;

import java.util.List;
import java.util.Map;

public class OrderService {
    private List <Order> order;
    int id  = 1;

    public  FoodItem findItem(List <FoodItem> menu,int id)
    {
     for (FoodItem fd : menu)
     {
         if(fd.getItemId() ==  id)
         {
             return fd;
         }
     }
     return  null;
    }
    public Order createOrder(Customer c, Restaurant r, Map<FoodItem,Integer> items)
    {
        double total = 0;
        for (Map.Entry<FoodItem ,Integer> fd  :  items.entrySet())
        {
            total += fd.getKey().getPrice() * fd.getValue();
        }
        Order  order  =  new Order(id++,c,r,items,total);
        return order;
    }
}
