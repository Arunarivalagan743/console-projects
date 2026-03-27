package Fodd;

import Fodd.Controller.AppController;
import Fodd.Model.Customer;
import Fodd.Model.FoodItem;
import Fodd.Model.Restaurant;
import Fodd.Service.AuthService;
import Fodd.Service.OrderService;
import Fodd.View.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer(1, "arun", "arun@gmail.com", "arun123", "tiruper");
        Customer cus2 = new Customer(2, "hari", "hari@gmail.com", "hari123", "tiruper");
        List<FoodItem> menu1 = Arrays.asList(
                new FoodItem(1, "pizza", 300),
                new FoodItem(2, "Burger", 200)
        );
        List<FoodItem> menu2 = Arrays.asList(
                new FoodItem(1, "dosa", 90),
                new FoodItem(2, "idly", 100)
        );
        List <Customer> customerList = new ArrayList<>();
        customerList.add(cus1);
        customerList.add(cus2);

        Restaurant r1 = new Restaurant(1, "max", "max@gmail.com", "max@123", "asd234", menu1);
        Restaurant r2 = new Restaurant(2, "a2b", "a2b@gmail.com", "a2b@123", "axdd234", menu2);
        List <Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(r1);
        restaurantList.add(r2);
        AuthService authService  =  new AuthService();
        OrderService orderService =  new OrderService();
        App view =  new App();
        AppController controller =  AppController.getInstance(customerList,restaurantList,authService,orderService,view);
        controller.run();


    }
}