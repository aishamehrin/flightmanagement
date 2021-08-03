package com.company;

public class ScheduledFlights {
    int slNo;
    int startId;
    int flightId;
    int destinationId;

    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }

    public int getStartId() {
        return startId;
    }

    public void setStartId(int startId) {
        this.startId = startId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public ScheduledFlights( int slNo,int flightId,int startId, int destinationId) {
        this.startId = startId;
        this.flightId = flightId;
        this.destinationId = destinationId;
    }
}