package Challenge.PolymorphismThree;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Car -> start Engine");
    }

    public void drive() {
        runEngine();
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> run Engine");
    }
}
