package Fodd.View;

import Fodd.Model.FoodItem;
import Fodd.Model.Order;
import Fodd.Model.Restaurant;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    public String getStringInput(String msg) {
        System.out.println(msg);
        String s = sc.nextLine();
        return s;
    }

    public int getIntInput(String msg) {
        System.out.println(msg);
        int s = sc.nextInt();
        return s;
    }

    public void showRestaraunts(List<Restaurant> restaurants) {
        int i = 1;
        for (Restaurant r : restaurants) {
            System.out.println((i++) + "-> " + r.getName());
        }
    }

    public void showMenu(List<FoodItem> menu) {
        for (FoodItem fi : menu) {
            System.out.println(fi.getItemId() + "=> " + fi.getName() + "₹ " + fi.getPrice());
        }
    }

    public void showOrder(Order order) {
        System.out.println("\n Order Placed!!!");
        System.out.println(order.getRestaurant().getName());
        System.out.println("Price of  the order: " + order.getTotalPrice());
        for (Map.Entry<FoodItem, Integer> e : order.getOrderItem().entrySet()) {
            System.out.println(e.getKey().getName() + " " + e.getValue() + "=> " + e.getKey().getPrice());
        }
    }


}
