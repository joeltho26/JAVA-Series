package Challenge.OOP;

public class DeluxeBurger extends Burger{
    private Item deluxe1;
    private Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        this.deluxe1= new Item(0,"toppings",extra4);
        this.deluxe2= new Item(0,"toppings",extra5);
    }

    @Override
    public void printItemlizedList() {
        super.printItemlizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
