package Example.LinkedHashSetAndTreeSet;

import Example.HashSet.Contacts.Contact;
import Example.HashSet.Contacts.ContactData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        Comparator<Contact> sortByName = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(sortByName);
        sorted.addAll(phones);
        System.out.println("-".repeat(25));
        System.out.println("Using Comparator");
        System.out.println("-".repeat(25));
        sorted.forEach(System.out::println);


        NavigableSet<String> names = new TreeSet<>();
        phones.forEach(name -> names.add(name.getName()));
        System.out.println("-".repeat(25));
        System.out.println("Printing Names");
        System.out.println("-".repeat(25));
        System.out.println(names);

        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        System.out.println("-".repeat(25));
        System.out.println("Complete Set");
        System.out.println("-".repeat(25));
        fullSet.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("-".repeat(25));
        System.out.println("Using Comparator different approach");
        System.out.println("-".repeat(25));
        fullList.forEach(System.out::println);

        // min-max
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());
        System.out.println("-".repeat(25));
        System.out.println("Min-Max:");
        System.out.println("-".repeat(25));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // first-last
        System.out.println("-".repeat(25));
        System.out.println("First-Last");
        System.out.println("-".repeat(25));
        System.out.println("First: " +fullSet.first());
        System.out.println("Last: " + fullSet.last());
        System.out.println("-".repeat(25));
        fullSet.forEach(System.out::println);

        // poll first & poll last
        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("-".repeat(25));
        System.out.println("pollFirst-pollLast");
        System.out.println("-".repeat(25));
        System.out.println("Polled First: " + copiedSet.pollFirst());
        System.out.println("Polled Last: " + copiedSet.pollLast());

        // ceiling
        Contact ceiling = fullSet.ceiling(new Contact("Munro James"));
        Contact ceiling2 = fullSet.ceiling(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using Ceiling");
        System.out.println("-".repeat(25));
        System.out.println("Ceiling with non exiting element: " + ceiling);
        System.out.println("Ceiling with exiting element: " + ceiling2);

        // floor
        Contact floor = fullSet.floor(new Contact("Munro James"));
        Contact floor2 = fullSet.floor(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using Floor");
        System.out.println("-".repeat(25));
        System.out.println("Floor with non exiting element: " + floor);
        System.out.println("Floor with exiting element: " + floor2);

        // higher
        Contact higher = fullSet.higher(new Contact("Munro James"));
        Contact higher2 = fullSet.floor(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using Higher");
        System.out.println("-".repeat(25));
        System.out.println("Higher with non exiting element:: " + higher);
        System.out.println("Higher with exiting element: " + higher2);

        // lower
        Contact lower = fullSet.lower(new Contact("Munro James"));
        Contact lower2 = fullSet.floor(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using Lower");
        System.out.println("-".repeat(25));
        System.out.println("Lower with non exiting element: " + lower);
        System.out.println("Lower with exiting element: " + lower2);

        // descending
        NavigableSet<Contact> descendingSet = fullSet.descendingSet();
        System.out.println("-".repeat(25));
        System.out.println("Using Descending Sort");
        System.out.println("-".repeat(25));
        descendingSet.forEach(System.out::println);
        System.out.println("-".repeat(25));

        // if we pollLast or pollFirst values from descending set then the fullset respective values is also removed
        Contact pollLastDescending = descendingSet.pollLast();
        System.out.println("-".repeat(25));
        System.out.println("Using Descending Sort -> pollLast");
        System.out.println("-".repeat(25));
        System.out.println("Removed: (pollLast): " + pollLastDescending);
        System.out.println("-".repeat(25));
        descendingSet.forEach(System.out::println);
        System.out.println("-".repeat(25));
        fullSet.forEach(System.out::println);
        System.out.println("-".repeat(25));

        //headSet
        Contact marion = new Contact("Marion Jones");
        var headSet = fullSet.headSet(marion);
        var headSet2 = fullSet.headSet(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using HeadSet with and without existing values");
        System.out.println("-".repeat(25));
        headSet.forEach(System.out::println);
        System.out.println("-".repeat(25));
        headSet2.forEach(System.out::println);
        System.out.println("-".repeat(25));
        fullSet.forEach(System.out::println);
        var headSet3 = fullSet.headSet(marion,true);
        System.out.println("-".repeat(25));
        headSet3.forEach(System.out::println);


        //tailSet
        Contact marion2 = new Contact("Marion Jones");
        SortedSet<Contact> tailSet = fullSet.tailSet(marion2);
        var tailSet2 = fullSet.tailSet(new Contact("Franz Stigler"));
        System.out.println("-".repeat(25));
        System.out.println("Using tailSet with and without existing values");
        System.out.println("-".repeat(25));
        tailSet.forEach(System.out::println);
        System.out.println("-".repeat(25));
        tailSet2.forEach(System.out::println);
        System.out.println("-".repeat(25));
        fullSet.forEach(System.out::println);

        //subSet
        System.out.println("-".repeat(25));
        System.out.println("Using subSet with and without existing values");
        System.out.println("-".repeat(25));
        var subset = fullSet.subSet(new Contact("Donald Duck"),new Contact("Micky Mouse"));
        subset.forEach(System.out::println);
        System.out.println("-".repeat(25));
        var subset2 = fullSet.subSet(new Contact("Donald Duck"),false,new Contact("Micky Mouse"),true);
        subset2.forEach(System.out::println);
        System.out.println("-".repeat(25));

    }
}
