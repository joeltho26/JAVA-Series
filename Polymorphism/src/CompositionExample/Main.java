package CompositionExample;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(12,13,15);
        ComputerCase computercase = new ComputerCase("2208","Dell",dimensions,"240");
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27,"2540x1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
        DigitalProduct digitalProduct = new DigitalProduct("Windows 10","Microsoft","Windows 11.3","15-05-2018");
        PersonalComputer computer = new PersonalComputer("2208","Dell",monitor,computercase,motherBoard,digitalProduct);
        computer.getComputerCase().pressPowerButton();
        computer.getMotherBoard().loadProgram("Windows OS");
        computer.getMonitor().drawPixelsAt(10,10,"red");
        computer.powerUp();

    }
}
