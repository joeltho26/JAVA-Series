package CompositionExample;


public class Product {
    private String model;
    private String manufacturer;
    private Dimensions dimensions;

    public Product(String model, String manufacturer,Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;

    }


    public Product(String model, String manufacturer) {
        this(model,manufacturer,new Dimensions(10,10,10));
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
