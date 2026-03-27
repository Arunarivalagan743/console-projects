package travelplanner;

import java.time.LocalDate;

public class ItineraryService {

    public Itinerary createItinerary(User user, Destination dest, int itineraryId, String name, LocalDate start, LocalDate end) {
        return new Itinerary(itineraryId, user.getUserId(), dest, name, start, end);
    }

    public void addItem(Itinerary itinerary, ItineraryItem item) {
        itinerary.addItem(item);
    }

    public void removeItem(Itinerary itinerary, ItineraryItem item) {
        itinerary.removeItem(item);
    }
}
