package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Flights> flightsList = new ArrayList<>();
    static List<AirPort> airPorts = new ArrayList<>();
    static List<ScheduleTrip> sTrip = new ArrayList<>();

    static List<ScheduledFlights> getScheduledFlights(int startId, int destinationId) {
        List<ScheduledFlights> scheduledFlights2 = new ArrayList<>();
        for (int i = 0; i < airPorts.size(); i++) {
            if (airPorts.get(i).getid() == startId) {
                AirPort temp = airPorts.get(i);
                List<ScheduledFlights> scheduledFlights = temp.getScheduledFlights();

                for (int j = 0; j < scheduledFlights.size(); j++) {
                    if (scheduledFlights.get(j).getDestinationId() == destinationId) {
                        scheduledFlights2.add(temp.scheduledFlights.get(j));
                    }
                }


            }
        }
        return scheduledFlights2;
    }

    //
    static void scheduledFlights(int slNo, int flightId, int startId, int destinationId) {
        for (int i = 0; i < airPorts.size(); i++) {
            if (airPorts.get(i).getid() == startId) {
                AirPort temp = airPorts.get(i);
                ScheduledFlights scheduledFlights1 = new ScheduledFlights( slNo,flightId,startId, destinationId);
                temp.scheduledFlights.add(scheduledFlights1);
                airPorts.set(i, temp);

            }
        }
    }

    public static void main(String[] args) {
        //flights

        Flights airIndia = new Flights(1, "airIndia", "at airport");
        Flights kingFisher = new Flights(2, "kingFisher", "flying");
        System.out.println("adding flights");
        flightsList.add(airIndia);
        flightsList.add(kingFisher);



        //airport input
        AirPort a = new AirPort(1, 1, new ArrayList<>());
        AirPort b = new AirPort(2, 2, new ArrayList<>());
        System.out.println("adding airports");
        airPorts.add(a);
        airPorts.add(b);

        airIndia.setStatus("flying");
        System.out.println("status of air india");
        System.out.println(airIndia.getStatus());

        scheduledFlights(1, 1, 2, 1);
        scheduledFlights(2, 2, 1, 2);
        System.out.println("flight added to airport");
        System.out.println(airPorts.get(0).scheduledFlights.get(0).getFlightId());

        getScheduledFlights(1, 2);

        ScheduleTrip s1 = new ScheduleTrip(1, 1, 2);
        ScheduleTrip s2 = new ScheduleTrip(2, 2, 1);
        sTrip.add(s1);
        sTrip.add(s2);
        for (int i = 0; i < sTrip.size(); i++) {
            System.out.println(String.format("flight %d,  flightId %d, destination id %d", sTrip.get(i).getId(), sTrip.get(i).getStartId(), sTrip.get(i).getDestinationId()));
        }

    }
}