package Example;

public class Dog extends Mammal{

    public Dog(String type, double weight) {
        super(type, weight);
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("faster")) {
            System.out.println(explicitType() + " is running ");
        } else {
            System.out.println(explicitType() + " is walking ");
        }
    }

    @Override
    public void shredHair() {
        System.out.println(explicitType() + " shreds hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("Wolf")) {
            System.out.println("Howling...");
        } else {
            System.out.println("Woof...");
        }
    }

}
