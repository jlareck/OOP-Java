package model;

public abstract class Aircraft implements Comparable<Aircraft>{
    private int payload;
    private int rangeOfFlight;
    private int fuel;
    private String name;

    public Aircraft(String name, int payload, int rangeOfFlight, int fuel) {
        this.payload = payload;
        this.rangeOfFlight = rangeOfFlight;
        this.fuel = fuel;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int compareTo(Aircraft aircraft) {
        return this.rangeOfFlight - aircraft.rangeOfFlight;
    }


}
