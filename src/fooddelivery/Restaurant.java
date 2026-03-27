package fooddelivery;

import java.util.ArrayList;
import java.util.List;

public final class Restaurant extends User {
    private final String location;
    private final List<MenuItem> menu = new ArrayList<>();

    public Restaurant(int userId, String name, String phone, String location) {
        super(userId, name, phone);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void confirmOrder(Order order) {
        order.updateStatus("CONFIRMED_BY_RESTAURANT");
    }

    public void updateMenu() {
    }

    public void prepareOrder(Order order) {
        order.updateStatus("PREPARING");
    }

    public void markOrderReady(Order order) {
        order.updateStatus("READY_FOR_PICKUP");
    }
}
