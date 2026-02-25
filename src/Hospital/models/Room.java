package Hospital.models;

public class Room {

    private int roomNo;
    private String type;
    private double charges;
    private boolean isOccupied;

    public Room(int roomNo, String type, double charges) {
        this.roomNo = roomNo;
        this.type = type;
        this.charges = charges;
        this.isOccupied = false;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    public void occupy() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }
}