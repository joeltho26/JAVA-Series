package InheritanceExample;

public class Fish extends Animal{
    private int gills;
    private int fins;
    public Fish () {

    }

    public Fish(double weight, int gills, int fins) {
        this("Whale",weight,gills,fins);
    }

    public Fish(int gills, int fins) {
        this("Goldfish", 0.25,gills,fins);
    }

    public Fish(String type, double weight, int gills, int fins) {
        super(type, weight>200? "Big": weight<1? "Small":"Medium", weight);
        this.gills = gills;
        this.fins = fins;
    }

    void moveMuscle() {
        System.out.println("moving muscle...");
    }

    void moveFin() {
        System.out.println("moving fin...");
    }

    @Override
    void move(String speed) {
        super.move(speed);
        if (speed.equalsIgnoreCase("fast")) {
            moveFin();
            moveMuscle();
        } else {
            moveMuscle();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
