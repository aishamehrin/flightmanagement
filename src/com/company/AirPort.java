package com.company;

import java.util.List;

public class AirPort {
    public int id;//airport id
    public int flightId;
    List<ScheduledFlights> scheduledFlights;

    public AirPort(int id, int flightId, List<ScheduledFlights> scheduledFlights) {
        this.id = id;
        this.flightId = flightId;
        this.scheduledFlights = scheduledFlights;
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocation() {
        return flightId;
    }

    public void setLocation(String location) {
        this.flightId = flightId;
    }

    public List<ScheduledFlights> getScheduledFlights() {
        return scheduledFlights;
    }
}
