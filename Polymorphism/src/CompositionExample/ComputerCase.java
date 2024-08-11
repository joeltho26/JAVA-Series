package CompositionExample;

public class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer, Dimensions dimensions, String powerSupply) {
        super(model, manufacturer, dimensions);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    void pressPowerButton() {
        System.out.println("Power button pressed...");
    }
}
