package model;

public class Helicopter extends Aircraft {
    public Helicopter(String name, int payload, int rangeOfFlight, int fuel) {
        super(name, payload, rangeOfFlight, fuel);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "name='" + getName() +
                ", payload=" + getPayload() +
                ", rangeOfFlight=" + getRangeOfFlight() +
                ", fuel=" + getFuel() +
                '\'' +
                '}';
    }
}
