package ConvenienceMethods.Example.ExampleTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        record Person(String firstName, String lastName) {

        }

        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("John", "Wilkins"),
                new Person("Rob", "Doe"),
                new Person("Micky", "Mouse"),
                new Person("Minnie", "Mouse")));

        persons.sort((a,b) -> a.firstName.compareTo(b.firstName));

        persons.sort(Comparator.comparing(a -> a.firstName));
        persons.forEach(System.out::println);

        System.out.println("-".repeat(20));
        persons.sort(Comparator.comparing(Person::lastName));
        persons.forEach(System.out::println);

        System.out.println("-".repeat(20));
        persons.sort(Comparator.comparing(Person::lastName).thenComparing(Person::firstName).reversed());
        persons.forEach(System.out::println);


    }
}
