package Example;

abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Mammal(String type, double weight) {
        super(type, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(explicitType() + " is ");
        System.out.printf("%s...%n",speed.equalsIgnoreCase("slow") ? "waking":"running");
    }

    public abstract void shredHair();
}
