package model;

public class Airplane extends Aircraft{

    public Airplane(String name, int payload, int rangeOfFlight, int fuel) {
        super(name, payload, rangeOfFlight, fuel);

    }
    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + getName() +
                ", payload=" + getPayload() +
                ", rangeOfFlight=" + getRangeOfFlight() +
                ", fuel=" + getFuel() +
                '\'' +
                '}';
    }

}
