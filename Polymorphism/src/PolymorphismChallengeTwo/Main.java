package PolymorphismChallengeTwo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        showOperations(car);
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        showOperations(mitsubishi);
        Ford ford = new Ford(6, "Ford Falcon");
        showOperations(ford);
        Holden holden = new Holden(6, "Holden Commodore");
        showOperations(holden);
    }

    public static void showOperations (Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("------------");
    }
}
