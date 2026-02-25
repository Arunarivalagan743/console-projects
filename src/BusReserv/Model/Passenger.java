package BusReserv.Model;

import java.util.Date;

public class Passenger {

    private String name;
    private String destination;
    private Date date;


    public Passenger(String newname, String newdestination, Date newdate) {
        name = newname;
       destination = newdestination;
       date = newdate;
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