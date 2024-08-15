package Example;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flight = bird;
        Trackable trackable = bird;
        bird.move();
        animal.move();
        //flight.move() => not possible since flight is of FlightEnabled (interface)
        flight.takeOff();
        flight.fly();
        flight.land();
        trackable.track();

    }
}
