package Example.HashMap;

import java.util.*;

public class MapViewsMain {
    public static void main(String[] args) {
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(contact -> contacts.put(contact.getName(),contact));
        ContactData.getData("email").forEach(contact -> contacts.put(contact.getName(),contact));
        contacts.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("-".repeat(30));

        //keySet
        // unordered
        Set<String> keyStrings = contacts.keySet();
        keyStrings.forEach(System.out::println);
        System.out.println("-".repeat(30));

        // ordered
        Set<String> copiedKeySet = new TreeSet<>(keyStrings);
        copiedKeySet.forEach(System.out::println);
        System.out.println("-".repeat(30));

        //contains
        System.out.println("Contains:");
        System.out.println("-".repeat(30));
        boolean contains = contacts.containsKey("Charlie Brown");
        if (contains) {
            System.out.println("Contains the value " + contacts.get("Charlie Brown"));
        } else {
            System.out.println(contacts.get("Charlie Brown") + " value not present");
        }
        System.out.println("-".repeat(30));


        keyStrings.remove("Charlie Brown"); // while removing values from view, it will also remove values from the main data memory
        keyStrings.forEach(System.out::println);
        System.out.println("-".repeat(30));
        contacts.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("-".repeat(30));

        // while using copied set then if we remove any value it won't remove any data from the main data memory (Set/Map)
        copiedKeySet.remove("Donald Duck");
        copiedKeySet.forEach(System.out::println);
        System.out.println("-".repeat(30));
        contacts.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("-".repeat(30));

        //retainAll
        keyStrings.retainAll(List.of("Franz Stigler","Belka Sputnik2","Rajini Thalaivar"));
        keyStrings.forEach(System.out::println);
        System.out.println("-".repeat(30));
        contacts.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("-".repeat(30));

        keyStrings.clear();
        System.out.println(keyStrings);
        System.out.println("-".repeat(30));

        //keyStrings.add("James Bond"); => not supported
        // if we perform the below steps, the views are again loaded with data (need not again assign and create contacts)
        ContactData.getData("phone").forEach(contact -> contacts.put(contact.getName(),contact));
        ContactData.getData("email").forEach(contact -> contacts.put(contact.getName(),contact));

        //values
        var values = contacts.values();
        values.forEach(System.out::println);
        System.out.println("-".repeat(30));

        values.retainAll(ContactData.getData("phone"));
        values.forEach(System.out::println);
        System.out.println("-".repeat(30));

        List<Contact> valuesCopied = new ArrayList<>(values);
        var sortByName = Comparator.comparing(Contact::getFullName);
        valuesCopied.sort(sortByName);
        valuesCopied.forEach(value -> System.out.println(value.getFullName() + " | " + value));
        System.out.println("-".repeat(30));

        Contact first = valuesCopied.get(0);
        contacts.put(first.getFullName(), first);
        values.forEach(System.out::println);
        System.out.println("-".repeat(30));
        keyStrings.forEach(System.out::println);
        System.out.println("-".repeat(30));

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        System.out.println("-".repeat(30));
        if (set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate Values are in my Map");
        }
        System.out.println("-".repeat(30));

        //entrySet
        System.out.println("EntrySet:");
        System.out.println("-".repeat(30));
        Set<Map.Entry<String,Contact>> entrySet = contacts.entrySet();
        entrySet.forEach(System.out::println);

        var nodeSet = contacts.entrySet();
        for (var node : nodeSet) {
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println(node.getClass().getName());
                System.out.println("Key doesn't match name: " + node.getKey() + ": " +
                        node.getValue());
            }
        }

    }
}
