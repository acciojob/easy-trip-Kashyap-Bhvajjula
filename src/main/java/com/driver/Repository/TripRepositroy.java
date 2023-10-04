package com.driver.Repository;

import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TripRepositroy {


    private Map<String, Airport> airportMap = new HashMap<>();
    private Map<Integer, Flight> flightMap = new HashMap<>();
    private Map<Integer, Passenger> passengerMap = new HashMap<>();
    private Map<Integer, List<Passenger>> flightPassengerMap = new HashMap<>();
    private Map<Integer, List<Flight>> bookedFlightByPassenger = new HashMap<>();

    public Map<String, Airport> getAirportMap() {
        return airportMap;
    }

    public void setAirportMap(Map<String, Airport> airportMap) {
        this.airportMap = airportMap;
    }

    public Map<Integer, Flight> getFlightMap() {
        return flightMap;
    }

    public void setFlightMap(Map<Integer, Flight> flightMap) {
        this.flightMap = flightMap;
    }

    public Map<Integer, Passenger> getPassengerMap() {
        return passengerMap;
    }

    public void setPassengerMap(Map<Integer, Passenger> passengerMap) {
        this.passengerMap = passengerMap;
    }

    public Map<Integer, List<Passenger>> getFlightPassengerMap() {
        return flightPassengerMap;
    }

    public void setFlightPassengerMap(Map<Integer, List<Passenger>> flightPassengerMap) {
        this.flightPassengerMap = flightPassengerMap;
    }

}
