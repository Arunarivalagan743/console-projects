package Fodd.Model;

import java.util.Map;

public class Order {
    private int orderId;
    private  Customer customer;
    private  Restaurant restaurant;
    private Map<FoodItem,Integer> orderItem;
    private  double totalPrice;


    public Order(int orderId, Customer customer, Restaurant restaurant, Map<FoodItem, Integer> orderItem,double totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItem = orderItem;
        this.totalPrice =  totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Map<FoodItem, Integer> getOrderItem() {
        return orderItem;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
