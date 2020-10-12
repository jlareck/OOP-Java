package company;

import model.*;

import java.util.List;
import java.util.Scanner;
class UserInterface {
    private Airport airport;
    private Scanner input;

    private static UserInterface instance;
    private UserInterface(){}

    public static UserInterface getInstance() {
        if (instance == null) {
            synchronized (UserInterface.class) {
                if (instance == null) {
                    instance = new UserInterface();
                }
            }
        }
        return instance;
    }

    public void runUserInterface() {
        airport = new Airport("airport");
        input = new Scanner(System.in);
        while (true) {
            printMenu();
            int command = input.nextInt();
            if (command == 6) {
                break;
            }
            commandExecution(command);
        }

    }

    private void printMenu(){
        System.out.println("Hi, welcome to the airport. Choose the action:\n" +
                "1. Create the Airplane \n" +
                "2. Create the Helicopter \n" +
                "3. Show all aircrafts \n" +
                "4. Sort aircrafts by range of flight \n" +
                "5. Find aircrafts by fuel range\n" +
                "6. Exit");
    }

    private void commandExecution(int command) {
        switch (command) {
            case 1: {
                Aircraft aircraft = createAircraft(AircraftType.Airplane);
                airport.addAircraft(aircraft);
                break;
            }
            case 2: {
                Aircraft aircraft = createAircraft(AircraftType.Helicopter);
                airport.addAircraft(aircraft);
                break;
            }
            case 3: {
                System.out.println("All Aircrafts: ");
                airport.printAircrafts();
                break;
            }
            case 4: {
                System.out.println("Sorted aircrafts");
                airport.sortAircraftsByRangeOfFlight();
                airport.printAircrafts();
                break;
            }
            case 5: {
                System.out.println("Enter lower bound");
                int lowerBound = input.nextInt();
                System.out.println("Enter upper bound");
                int upperBound = input.nextInt();
                List<Aircraft> result = airport.getAircraftsByFuelRange(lowerBound, upperBound);
                System.out.println(result);
                break;
            }

        }
    }

    private Aircraft createAircraft(AircraftType type) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Choose a name for your airplane");
        String name = inputString.nextLine();
        System.out.println("Enter the payload");
        int payload = input.nextInt();
        System.out.println("Enter the range of flight");
        int rangeOfFlight = input.nextInt();
        System.out.println("Enter the volume of fuel");
        int fuel = input.nextInt();
        if (type == AircraftType.Airplane) {
            return new Airplane(name,payload,rangeOfFlight,fuel);
        }
        else {
            return new Helicopter(name,payload,rangeOfFlight,fuel);
        }
    }
}
