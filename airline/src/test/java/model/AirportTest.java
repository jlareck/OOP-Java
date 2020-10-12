package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    @Test
    void testAirport() {
        Airport airport = new Airport("airport");
        Aircraft airplaneA = new Airplane("A", 10,20,20);
        Aircraft airplaneB = new Airplane("B", 10,100,100);
        Aircraft airplaneC = new Airplane("C", 10,70,70);
        Aircraft airplaneD = new Airplane("A", 10,10,30);

        airport.addAircraft(airplaneA);
        airport.addAircraft(airplaneB);
        airport.addAircraft(airplaneC);
        airport.addAircraft(airplaneD);
        airport.sortAircraftsByRangeOfFlight();

        Aircraft arr[] = new Aircraft[]{airplaneD,airplaneA,airplaneC,airplaneB};
        List<Aircraft> expectedSortedAircrafts = new ArrayList<>(Arrays.asList(arr));

        assertEquals(airport.getAllAircrafts(), expectedSortedAircrafts);

        List<Aircraft> expecteFoundAircrafts = new ArrayList<>();
        expecteFoundAircrafts.add(airplaneC);
        expecteFoundAircrafts.add(airplaneB);
        assertEquals(airport.getAircraftsByFuelRange(50, 150), expecteFoundAircrafts);

        assertEquals(airport.getTotalPayload(),40);
    }
}