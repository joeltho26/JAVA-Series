package Challenge.Polymorphism;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinder;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinder, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
        this.batterySize = batterySize;
    }
}
