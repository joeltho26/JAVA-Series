package Example.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-".repeat(30));

        Map<String, Contact> contacts = new HashMap<>();
        for (Contact contact: fullList) {
            contacts.put(contact.getName(),contact);
        }

        //print keys and values
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        //get value with key
        System.out.println("get:");
        System.out.println("-".repeat(30));
        System.out.println(contacts.get("Rajini Thalaivar"));
        System.out.println("-".repeat(30));

        // getOrDefault
        System.out.println("getOrDefault:");
        System.out.println("-".repeat(30));
        System.out.println(contacts.getOrDefault("Ranjini Tulasi", new Contact("Marion Rowen", "rowenmario@gmail.com")));
        System.out.println("-".repeat(30));

        // clear
        contacts.clear();
        for(Contact contact: fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));
        contacts.clear();

        // putIfAbsent
        System.out.println("putIfAbsent: ");
        System.out.println("-".repeat(30));
        contacts.putIfAbsent("Rajini Thalaivar", new Contact("Rajini Thalaivar", 988689897));
        contacts.putIfAbsent("Munroe James", new Contact("Munroe James", 218639891));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // putIfAbsent => it ignores the element and doesn't update with new values.
        for(Contact contact: fullList) {
            contacts.put(contact.getName(),contact);
        }
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));
        contacts.clear();

        for(Contact contact: fullList) {
            Contact duplicate = contacts.put(contact.getName(),contact);
            if (duplicate!=null) {
                contacts.put(contact.getName(),contact.mergeContactData(duplicate));
            }
        }

        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));
        contacts.clear();

        // merge
        System.out.println("Merge:");
        System.out.println("-".repeat(30));
        fullList.forEach(contact -> contacts.merge(contact.getName(),contact,
                Contact::mergeContactData));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // compute
        System.out.println("Compute:");
        System.out.println("-".repeat(30));
        contacts.compute("Mylie Brown", (k,v) -> new Contact(k));
        contacts.compute("Charlie Brown", (k,v) -> new Contact(k));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // computeIfPresent
        System.out.println("computeIfPresent:");
        System.out.println("-".repeat(30));
        contacts.computeIfPresent("Mylie Brown", (k,v) -> new Contact(k,"mylie1070@hotmail.com"));
        contacts.computeIfPresent("Charlie Brown", (k,v) -> {
            v.addEmail("Amazon");
            return v;
        });
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // computeIfAbsent
        System.out.println("computeIfAbsent:");
        System.out.println("-".repeat(30));
        contacts.computeIfAbsent("Mylie Brown", (k) -> new Contact(k, "mylie1070@hotmail.com"));
        Contact newContact = new Contact("Robert Miles", "robertmiles@yahoo.com", 679642557);
        contacts.computeIfAbsent(newContact.getName(), Contact::new);
        contacts.computeIfAbsent("Charlie Brown", (k) -> new Contact(k));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // replace
        System.out.println("replace:");
        System.out.println("-".repeat(30));
        Contact replacedContact = contacts.replace("Belka Sputnik2", new Contact("Belka Sputnik2", "belka@gmail.com"));
        System.out.println("old Value: " + replacedContact); // while replacing, it returns the old value
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));
        contacts.replace("Donald Duck",contacts.get("Donald Duck"), new Contact("Ducky","donaldduck@google.com"));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        // replaceAll
        System.out.println("replaceAll:");
        System.out.println("-".repeat(30));
        contacts.replaceAll((k,v) -> {
            String value = v.getName().toUpperCase();
            v.setName(value);
            return v;
        });
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        Contact replacedContact2 = contacts.replace("Belka Sputnik2", new Contact("Belka Sputnik2".toUpperCase(), "belka@hotmail.com"));
        Contact updatedContact = replacedContact2.mergeContactData(new Contact("Belka Sputnik2".toUpperCase(),"belarussian@yandex.ru",427989902));
        boolean success = contacts.replace("Belka Sputnik2",replacedContact2,updatedContact);
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        if (success) {
            System.out.println("Successfully replaced!");
        } else {
            System.out.println("Unsuccessful!");
        }
        System.out.println("-".repeat(30));

        //remove
        System.out.println("Remove:");
        Contact removeContact = contacts.remove("Belka Sputnik2");
        System.out.println("-".repeat(30));
        System.out.println(removeContact);
        System.out.println("-".repeat(30));
        contacts.forEach((k,v) -> System.out.println("Key= " + k + ", Value= " + v));
        System.out.println("-".repeat(30));

        //remove
        Contact strelka = contacts.get("Strelka Sputnik2");
        success = contacts.remove("Strelka Sputnik2", strelka);
        if (success) {
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found to remove!");
        }
        System.out.println("-".repeat(30));

    }

}
