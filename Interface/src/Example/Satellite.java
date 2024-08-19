package Example;

import org.jetbrains.annotations.NotNull;

public class Satellite implements OrbitEarth{
    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeoff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}
