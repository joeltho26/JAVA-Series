package LambdaExpressionsFunctionalInterface.Example.ExampleOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return String.join(" ",firstName(), lastName());
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy","Martin"),
                new Person("Sally","Brown"),
                new Person("Ricky","Joe"),
                new Person("Michael","Clarke")));

        //using anonymous class comparator
        Comparator<Person> comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };
        people.sort(comparatorLastName);
        System.out.println(people);

        //using anonymous class directly into the sort method
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        });
        System.out.println(people);

        // using lambda expressions
        Comparator<Person> comparatorLastNameLambda = (o1, o2) -> o1.lastName.compareTo(o2.lastName);
        people.sort(comparatorLastNameLambda);
        System.out.println(people);

        // using lambda expressions (comparing)
        Comparator<Person> comparatorFirstNameLambdaComparing = Comparator.comparing(o -> o.firstName);

        people.sort(comparatorFirstNameLambdaComparing);
        System.out.println(people);

        // functional interface must strictly have only one abstract method
        //@FunctionalInterface => error since EnhancedComparator (secondLevel) + Comparator (compare), there are two abstract methods
        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorEnhanced = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                var result = o1.lastName.compareTo(o2.lastName);
                return result==0? secondLevel(o1,o2): result;
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        people.sort(comparatorEnhanced);
        System.out.println(people);
    }
}
