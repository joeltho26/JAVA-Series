package Example.Composition;

public class MotherBoard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturing, Dimensions dimensions, int ramSlots, int cardSlots,
                       String bios) {
        super(model, manufacturing, dimensions);
        this.bios = bios;
        if (ramSlots>=0) {
            this.ramSlots = ramSlots;
        } else {
            this.ramSlots=0;
        }

        if (ramSlots>=0) {
            this.cardSlots = cardSlots;
        } else {
            this.cardSlots=0;
        }
    }

    public MotherBoard(String model, String manufacturer,
                       int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.bios = bios;
        if (ramSlots>=0) {
            this.ramSlots = ramSlots;
        } else {
            this.ramSlots=0;
        }

        if (ramSlots>=0) {
            this.cardSlots = cardSlots;
        } else {
            this.cardSlots=0;
        }
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    void loadProgram(String programName) {
        System.out.println("Program " + programName + " started loading...");
    }
}
