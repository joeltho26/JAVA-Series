package CompositionExample;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private DigitalProduct digitalProduct;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, ComputerCase computerCase, MotherBoard motherBoard, DigitalProduct digitalProduct) {
        super(model,manufacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
        this.digitalProduct = digitalProduct;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void drawLogo() {
        monitor.drawPixelsAt(1200,50,"green");
        digitalProduct.runProgram();
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

}
