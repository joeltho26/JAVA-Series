package Example;

import org.jetbrains.annotations.NotNull;

public interface FlightEnabled {
    public abstract void takeoff(); // => abstract and public is redundant in interface
    abstract void land();
    // private final abstract cruise(); => No use of private, protected & final modifiers is allowed for mentioned abstract class
    void fly(); // => This is the correct way of declaring an abstract method inside interface

    public final static double milesToKilometer = 1.60934; //=> use of public, final, static keyword on variables inside interface is redundant
    double kilometersToMiles = 0.621371;

    default FlightStages transition(@NotNull FlightStages stage) {
//        System.out.println("Transition is not implemented on " + getClass().getSimpleName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}
