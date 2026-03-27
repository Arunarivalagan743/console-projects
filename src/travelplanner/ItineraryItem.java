package travelplanner;

import java.time.LocalDate;
import java.time.LocalTime;

public class ItineraryItem {
    private final int itemId;
    private String itemName;
    private String description;
    private final LocalDate date;
    private final LocalTime time;

    public ItineraryItem(int itemId, String itemName, String description, LocalDate date, LocalTime time) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void updateItem(String name, String desc) {
        this.itemName = name;
        this.description = desc;
    }
}
