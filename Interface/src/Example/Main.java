package Example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled fliers = bird;
        Trackable tracked = bird;

        bird.move();
//        flight.move();  //not possible since no move method implemented in FlightEnabled interface
//        tracked.move();
        animal.move();

        fliers.fly();
        fliers.land();
        fliers.takeoff();
        //flier.track(); => Not possible since no methods for track in FlightEnabled interface

        bird.takeoff();
        bird.fly();
        bird.land();
        bird.track();

        tracked.track();
        //tracked.takeoff() / tracked.fly() / tracked.land() ; => Not possible since no methods for track in FlightEnabled interface


        inFlight(fliers);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kilometersTravelled = 100;
        double milesTravelled = kilometersTravelled * FlightEnabled.kilometersToMiles;
        System.out.printf("The Truck travelled %.2f km or %.2f miles %n",kilometersTravelled,milesTravelled);

        List<FlightEnabled> flier = new ArrayList<FlightEnabled>();
        flier.add(bird);
        triggerFlier(flier);
        flyFlier(flier);
        landFlier(flier);

        List<FlightEnabled> betterfliers = new LinkedList<FlightEnabled>();
        betterfliers.add(bird);
        triggerFlier(betterfliers);
        flyFlier(betterfliers);
        landFlier(betterfliers);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFlier(@NotNull List<FlightEnabled> flier) {
        for (var fl: flier) {
            fl.takeoff();
        }
    }

    private static void flyFlier(@NotNull List<FlightEnabled> flier) {
        for (var fl: flier) {
            fl.fly();
        }
    }

    private static void landFlier(@NotNull List<FlightEnabled> flier) {
        for (var fl: flier) {
            fl.land();
        }
    }
}
