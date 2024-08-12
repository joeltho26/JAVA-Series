package PackageExample.dev.lpa;
import PackageExample.com.abc.first.Item;
import PackageExample.com.abc.first.*;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        System.out.println(firstItem);

        PackageExample.com.abc.first.Item secondItem = new PackageExample.com.abc.first.Item("Burger2");
        System.out.println(secondItem);
    }
}
