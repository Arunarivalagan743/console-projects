package travelplanner;

public class Destination {
    private final int destinationId;
    private final String name;
    private final String region;
    private final String description;
    private final String weather;

    public Destination(int destinationId, String name, String region, String description, String weather) {
        this.destinationId = destinationId;
        this.name = name;
        this.region = region;
        this.description = description;
        this.weather = weather;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDescription() {
        return description;
    }

    public String getWeather() {
        return weather;
    }

    public String getDetails() {
        return name + " (" + region + ") - " + description + " | Weather: " + weather;
    }
}
