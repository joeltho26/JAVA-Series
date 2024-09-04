package ArrayList.ArrayListExample.Grocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryItems = new ArrayList<GroceryItem>();
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add(new GroceryItem("apple","PRODUCE",6));
        groceryItems.add(new GroceryItem("oranges","PRODUCE",8));
        System.out.println(groceryItems);

        String[] items = {"apple","mango","grape","banana"};
        var fruits = List.of(items); //immutable list
        System.out.println(fruits);
        System.out.println(fruits.getClass().getName());

        var things = fruits.toArray();
        System.out.println(Arrays.toString(things));

        var fruitsUpdated = new ArrayList<>(fruits);
        fruitsUpdated.add("lime");
        System.out.println(fruitsUpdated);

        var fruitsUpdated1 = new ArrayList<>(List.of("apple","mango","grape","banana"));
        fruitsUpdated1.add("berry");
        System.out.println(fruitsUpdated1);
    }

}
