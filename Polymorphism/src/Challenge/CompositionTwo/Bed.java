package Challenge.CompositionTwo;

public class Bed {
    private String style;
    private int pillows;
    private int sheets;
    private int height;
    private int quilt;

    public Bed(String style, int pillows, int sheets, int height, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.height = height;
        this.quilt = quilt;
    }

    public void make () {
        System.out.println("Bed -> Making | ");
    }
}
