package Challenge.PolymorphismTwo;

public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> starting engine...";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerating...";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> braking...";
    }
}
