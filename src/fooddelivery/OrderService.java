package fooddelivery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OrderService {
    private int nextOrderId = 1000;
    private int nextOrderItemId = 5000;

    public OrderService() {
    }

    public Order createOrder(Customer customer, Restaurant restaurant, Map<Integer, Integer> itemQuantities) {
        Order order = new Order(nextOrderId++, customer.getUserId(), restaurant.getUserId());

        Map<Integer, MenuItem> menuById = new HashMap<>();
        for (MenuItem menuItem : restaurant.getMenu()) {
            menuById.put(menuItem.getItemId(), menuItem);
        }

        for (Map.Entry<Integer, Integer> request : itemQuantities.entrySet()) {
            MenuItem menuItem = menuById.get(request.getKey());
//            if (menuItem == null) {
//                throw new IllegalArgumentException("Menu item not found: " + request.getKey());
//            }
            OrderItem orderItem = new OrderItem(
                    nextOrderItemId++,
                    order.getOrderId(),
                    menuItem.getItemId(),
                    menuItem.getName(),
                    request.getValue(),
                    menuItem.getPrice()
            );
            order.addOrderItem(orderItem);
        }

        return order;
    }

    public void assignDelivery(Order order, DeliveryBoy deliveryBoy) {
        order.assignDeliveryBoy(deliveryBoy);
        order.updateStatus("DELIVERY_ASSI");
    }
}
