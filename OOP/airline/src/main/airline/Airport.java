package airline;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Airport {
    private List<Aircraft> aircrafts;
    String name;
    Airport(String name) {
        aircrafts = new ArrayList<>();
        this.name = name;
    }
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }
    public void sortAircraftsByRangeOfFlight() {
        Collections.sort(aircrafts);
    }
    public List<Aircraft> getAircraftsByFuelRange(int lowerBound, int higherBound) {
        List<Aircraft> aircraftsInRange = new ArrayList<>();
        for (Aircraft aircraft: aircrafts) {
            if (aircraft.getFuel() < higherBound && aircraft.getFuel() > lowerBound) {
                aircraftsInRange.add(aircraft);
            }
        }
        return aircraftsInRange;
    }
    public void printAircrafts() {
        System.out.println(aircrafts);
    }
    public List<Aircraft> getAllAircrafts() {
        return aircrafts;
    }
}
