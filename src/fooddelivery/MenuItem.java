package fooddelivery;

public final class MenuItem {
    private final int itemId;
    private final int restaurantId;
    private final String name;
    private final double price;

    public MenuItem(int itemId, int restaurantId, String name,double price) {
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
