package travelplanner;

public class Transport {
    private final int transportId;
    private final String type;
    private final String source;
    private final String destination;
    private final float price;

    public Transport(int transportId, String type, String source, String destination, float price) {
        this.transportId = transportId;
        this.type = type;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public int getTransportId() {
        return transportId;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public float getPrice() {
        return price;
    }

    public boolean checkAvailability() {
        return true;
    }
}
