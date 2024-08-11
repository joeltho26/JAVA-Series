package CompositionExample;

public class DigitalProduct extends Product {
    private String version;
    private String releaseDate;

    public DigitalProduct(String model, String manufacturer, String version, String releaseDate) {
        super(model, manufacturer);
        this.version = version;
        this.releaseDate = releaseDate;
    }

    public String getVersion() {
        return version;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void runProgram() {
        System.out.println("Running version " + getVersion() + " released on " + getReleaseDate());
    }
}
