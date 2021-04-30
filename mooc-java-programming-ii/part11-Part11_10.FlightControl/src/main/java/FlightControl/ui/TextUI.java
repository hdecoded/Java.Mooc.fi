package FlightControl.ui;

import FlightControl.domain.AirPlane;
import FlightControl.domain.AirPort;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        executeAirportAssetControl();
        System.out.println();
        executeAirportFlightControl();
        System.out.println();

    }

    private void executeAirportAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            }

            if (input.equals("1")) {
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());

                this.flightControl.addAirPlanes(id, capacity);
            }
            if (input.equals("2")) {
                System.out.println("Give the airplane id: ");
                AirPlane airPlaneId = flightControl.getAirPlaneID(scanner.nextLine());
                System.out.println("Give the departure airport id: ");
                String depAirPort = scanner.nextLine();
                AirPort depAPID = new AirPort(depAirPort);
                System.out.println("Give the target airport id: ");
                String targetAirPort = scanner.nextLine();
                AirPort tarAPID = new AirPort(targetAirPort);
                flightControl.addFlights(airPlaneId,depAPID,tarAPID);
            }


        }
    }

    private void executeAirportFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:\n" +
                    "[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n" +
                    "> ");

            String input = scanner.nextLine();

            if (input.equals("x") || input.equals("X")) {
                break;
            }
            if (input.equals("1")) {
                flightControl.getAirplanes().stream()
                        .forEach(airplane -> System.out.println(airplane));
            }
            if(input.equals("2")){
                flightControl.getFlights()
                        .stream()
                        .forEach(flight -> System.out.println(flight));
            }
            if(input.equals("3")){
                System.out.println("Give the airplane id: ");
                String airPlaneId = scanner.nextLine();
                flightControl.getAirplanes().stream()
                        .filter(airPlane -> airPlane.getId().equals(airPlaneId))
                        .forEach(airPlane -> System.out.println(airPlane));
            }
        }

    }
}
