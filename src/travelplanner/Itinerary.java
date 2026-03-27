package travelplanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Itinerary {
    private final int itineraryId;
    private final int userId;
    private final Destination destination;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private final List<ItineraryItem> items;

    public Itinerary(
            int itineraryId,
            int userId,
            Destination destination,
            String name,
            LocalDate startDate,
            LocalDate endDate
    ) {
        this.itineraryId = itineraryId;
        this.userId = userId;
        this.destination = destination;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.items = new ArrayList<>();
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public int getUserId() {
        return userId;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public List<ItineraryItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(ItineraryItem item) {
        items.add(item);
    }

    public void removeItem(ItineraryItem item) {
        items.remove(item);
    }

    public void updateDates(LocalDate start, LocalDate end) {
        this.startDate = start;
        this.endDate = end;
    }

    public void rename(String name) {
        this.name = name;
    }
}
