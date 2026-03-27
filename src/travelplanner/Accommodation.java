package travelplanner;

public class Accommodation {
    private final int accommodationId;
    private final String name;
    private final String location;
    private final float price;

    public Accommodation(int accommodationId, String name, String location, float price) {
        this.accommodationId = accommodationId;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }

    public boolean checkAvailability() {
        return true;
    }
}
