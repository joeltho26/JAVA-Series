package GetterSetterExample;

public class CarCalling {
    public static void main(String[] args) {
        Car car = new Car();
        car.describleCar();
        System.out.println("---------");

        car.describleCarWithValues();
        System.out.println("---------");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getGrade());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());
        System.out.println(car.isConvertible());
        System.out.println("---------");

        car.setMake("Honda");
        car.setModel("Accord");
        car.setGrade('A');
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);
        car.describleCar();
    }
}
