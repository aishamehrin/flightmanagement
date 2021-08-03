package com.company;

public class ScheduleTrip {

    int id;
    int startId;
    int destinationId;

    public int getId() {
        return id;
    }

    public void setfId(int id) {
        this.id = id;
    }

    public int getStartId() {
        return startId;
    }

    public void setStartId(int startId) {
        this.startId = startId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public ScheduleTrip(int id, int startId, int destinationId) {
        this.id = id;
        this.startId = startId;
        this.destinationId = destinationId;
    }

}
