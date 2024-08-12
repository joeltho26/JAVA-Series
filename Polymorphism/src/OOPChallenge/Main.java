package OOPChallenge;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item(1.50,"drinks","coke");
        coke.printItem();
        coke.setSize("Large");
        coke.printItem();

        Item avocado = new Item(1.50,"toppings","avocado");
        avocado.printItem();

        Burger burger = new Burger("regular",4.00);
        burger.addToppings("BACON", "CHEESE","MAYO");
        burger.printItem();

        MealOrder mealOrder = new MealOrder();
        mealOrder.printItemlizedList();

        MealOrder mealOrder = new MealOrder();
        mealOrder.addBurgerToppings("BACON","CHEESE","MAYO");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemlizedList();

        MealOrder secondMealOrder = new MealOrder("turkey","7-Up","Chilli");
        secondMealOrder.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMealOrder.setDrinkSize("SMALL");
        secondMealOrder.printItemlizedList();

        MealOrder mealOrder = new MealOrder("Deluxe","7-Up","chilli");
        mealOrder.addBurgerToppings("BACON","CHEESE","MAYO");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemlizedList();
    }
}
