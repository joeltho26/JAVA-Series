package PolymorphismChallengeThree;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinder;
    private int batterySize;

    public HybridCar(String description){
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinder, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> All %d cylinders are fired up. %n",cylinder);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!. %n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}
