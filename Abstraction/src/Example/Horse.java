package Example;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Horse(String type, double weight) {
        super(type, weight);
    }

    @Override
    public void shredHair() {
        System.out.println(explicitType() + " shreds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
