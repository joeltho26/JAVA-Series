package Challenge.PolymorphismThree;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        GasPoweredCar ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runRace(ferrari);

        ElectricCar tesla = new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(tesla);

        HybridCar hybridFerrari = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,20);
        runRace(hybridFerrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        System.out.println("--------");
    }
}
