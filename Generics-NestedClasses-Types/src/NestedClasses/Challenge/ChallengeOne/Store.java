package NestedClasses.Challenge.ChallengeOne;

public class Store {

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addToppings("Ketchup","Mayo","Bacon");
        System.out.println(meal);

        Meal MealUS = new Meal(0.68);
        MealUS.addToppings("Cheese","Mayo","Bacon","Cheddar");
        System.out.println(MealUS);
    }
}
