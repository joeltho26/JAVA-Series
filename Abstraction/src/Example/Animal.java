package Example;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(String type, double weight) {
        this(type,
                weight>500?"Large".toUpperCase():weight<20?"Small".toUpperCase():"Medium".toUpperCase(),
                weight);
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    @Override
    public String toString() {
        return type + " -> " + size + " -> " + weight;
    }

    public String explicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }

    public String getType() {
        return type;
    }
}
