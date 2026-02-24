package BusReserv.Model;

import java.util.Date;

public class Passenger {

    private String name;
    private String destination;
    private Date date;


    public Passenger(String name, String destination, Date date) {
        this.name = name;
        this.destination = destination;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDate() {
        return date;
    }
}