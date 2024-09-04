package Example.Package.dev.lpa;
import Example.Package.com.abc.first.Item;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        System.out.println(firstItem);

        PackageExample.com.abc.first.Item secondItem = new PackageExample.com.abc.first.Item("Burger2");
        System.out.println(secondItem);
    }
}
