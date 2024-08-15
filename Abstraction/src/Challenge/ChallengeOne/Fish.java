package Challenge.ChallengeOne;

public class Fish extends Animal{

    public Fish(String type, double weight) {
        super(type, weight);
    }

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slowly")) {
            System.out.println(explicitType() + " using only side fins to swim " + speed);
        } else {
            System.out.println(explicitType() + " using both back fins and side fins to swim " + speed);
        }
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("dolphin")) {
            System.out.println("Squealing...");
        } else {
            System.out.println("Boops...");
        }
    }
}
