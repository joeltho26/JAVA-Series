package OOPChallenge;

public class Item {
    private String size = "MEDIUM";
    private double price;
    private String type;
    private String name;

    public Item(double price, String type, String name) {
        this.price = price;
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
    }

    public String getName() {
        if(type.equalsIgnoreCase("SIDE") || type.equalsIgnoreCase("DRINKS")) {
            return size.toUpperCase() + " " + name.toUpperCase();
        }
        return name.toUpperCase();
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch(size.toUpperCase()) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n",name,price);
    }

    public void printItem() {
        printItem(getName(),getAdjustedPrice());
    }
}
