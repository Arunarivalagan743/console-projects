package Fodd.Controller;

import Fodd.Model.Customer;
import Fodd.Model.FoodItem;
import Fodd.Model.Order;
import Fodd.Model.Restaurant;
import Fodd.Service.AuthService;
import Fodd.Service.OrderService;
import Fodd.View.App;

import java.util.HashMap;
import java.util.List;

public class AppController {
    private  static  AppController instance;
    private List <Customer> customerList;
    private  List<Restaurant>  restaurantList;
    private AuthService  authService;
    private OrderService orderService;
    private App view;


    private AppController(List<Customer> customerList, List<Restaurant> restaurantList, AuthService authService, OrderService orderService,App view) {
        this.customerList = customerList;
        this.restaurantList = restaurantList;
        this.authService = authService;
        this.orderService = orderService;
        this.view =  view;
    }
    public static AppController getInstance(List<Customer> customerList, List<Restaurant> restaurantList, AuthService authService, OrderService orderService,App view)
    {
        if(instance == null)
        {
            instance =  new AppController(customerList,restaurantList,authService,orderService,view);
        }
        return instance;
    }
    public  void run()
    {
        String email  =  view.getStringInput("Enter your email: ");
        String password  =  view.getStringInput("Enter tour password: ");
        Customer customer =  authService.login(customerList,email,password);
        if(customer == null)
        {
            System.out.println("Invalid Custtomer");
            return;
        }
        view.showRestaraunts(restaurantList);
        int restaurantId =  view.getIntInput("Enter the restaurant Id : ");
        Restaurant restaurant =  restaurantList.get(restaurantId -  1);
        HashMap <FoodItem,Integer> cart =  new HashMap<>();

        while (true)
        {
            view.showMenu(restaurant.getItems());
            int itemId =  view.getIntInput("Enter the Item id: (0 to finish) ");
            if(itemId == 0) break;
            int qty  =-view.getIntInput("enter a quanity of item");

                FoodItem fd =  orderService.findItem(restaurant.getItems(),itemId);

                if(fd  == null)
                {
                    System.out.println("Invalid itemId");
                    break;
                }
                cart.put(fd,cart.getOrDefault(fd,0)+qty);

        }
        if(cart.isEmpty())
        {
            System.out.println("cart is empty");
            return;
        }
        Order order  = orderService.createOrder(customer,restaurant,cart);
        view.showOrder(order);
    }
}
