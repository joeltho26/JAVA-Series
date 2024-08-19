package Example;

import org.jetbrains.annotations.NotNull;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
        //OrbitEarth.log("Testing " + new Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(@NotNull FlightEnabled flier) {
        flier.takeoff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(@NotNull OrbitEarth flier) {
        flier.takeoff();
        flier.fly();
        flier.land();
    }
}
