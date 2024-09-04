package NestedClasses.Challenge.Meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private double price = 5.0;
    private Burger burger;
    private Item drinks;
    private Item sides;

    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        this.burger = new Burger("regular");
        this.drinks = new Item("Sprite","drinks",1.5);
        System.out.println(drinks);
        this.sides = new Item("French Fries","side",2.0);
    }

    public double getTotal() {
        double total = burger.getPrice() + drinks.price + sides.price;
        return Item.getPrice(total,conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%s$%.2f".formatted(burger,drinks,sides, "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings) {
        burger.addToppings(selectedToppings);
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name,type,type.equalsIgnoreCase("burger")?Meal.this.price:0.0);
        }
        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " (" + type + ") => " + getPrice(price,conversionRate);
        }

        private static double getPrice(double price,double rate) {
            return price * rate;
        }
    }

    private class Burger extends Item {

//        public Burger(String name) {
//            super(name, "burger");
//        }

        private enum Extra {AVOCADO,BACON,CHEESE,KETCHUP,MAYO,MUSTARD,PICKLES;

        private double getPrice() {
            return switch(this) {
                case AVOCADO -> 1.0;
                case CHEESE,BACON -> 1.5;
                default -> 0;
            };
        }}

        private List<Item> toppings = new ArrayList<>();

        public Burger(String name) {
            super(name, "burger",5.0);
        }

        public double getPrice() {
//            return Meal.this.price;
            double total = super.price;
            for(Item topping: toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings) {
            for (String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                } catch (IllegalArgumentException ie) {
                    System.out.println("No option available for " + selectedTopping);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for (Item topping: toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
