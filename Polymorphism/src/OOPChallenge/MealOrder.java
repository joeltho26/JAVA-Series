package OOPChallenge;

public class MealOrder {
    private Burger burger;
    private Item side;
    private Item drink;

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType,4.0);
        this.side = new Item(1.00,"side",sideType);
        this.drink = new Item(1.5,"drinks",drinkType);
    }

    public MealOrder() {
        this("regular","coke","fries");
    }

    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemlizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price",getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
