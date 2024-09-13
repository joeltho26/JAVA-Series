package Example.HashSet.Contacts;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(phones);
        Set<Contact> phoneContacts = new HashSet<>(emails);

        printData("Phone Set", phoneContacts);
        printData("Email Set", emailContacts);

        System.out.println("-".repeat(25));
        int index = emails.indexOf(new Contact("Charlie Brown"));
        Contact charlieBrown = emails.get(index);
        charlieBrown.addEmail("Meta Materials");
        charlieBrown.addEmail("Meta Materials");
        System.out.println(charlieBrown);

        // union
        Set<Contact> union = new HashSet<>();
        union.addAll(emailContacts);
        union.addAll(phoneContacts);
        printData("(A ∪ B) union of emails and phone contacts", union);

        // intersection
        Set<Contact> intersect = new HashSet<>();
        intersect.addAll(emailContacts);
        intersect.retainAll(phoneContacts);
        printData("(A ∩ B) intersection of emails and phone contacts", intersect);

        // difference (Asymmetric)
        Set<Contact> difference = new HashSet<>(emailContacts);
        difference.removeAll(phoneContacts);
        printData("(A - B) difference of emails and phone contacts", difference);

        //difference (Symmetric)
        Set<Contact> differenceAlternate = new HashSet<>(phoneContacts);
        differenceAlternate.removeAll(emailContacts);
        printData("(B - A) difference of phone and email contacts", differenceAlternate);

        Set<Contact> symmetricDifference = new HashSet<>(difference);
        symmetricDifference.addAll(differenceAlternate);
        printData("(B - A & A - B) Symmetric difference of phone and email contacts", symmetricDifference);

        //other difference (Symmetric) => union and intersect
        Set<Contact> symmetricDifference1 = new HashSet<>(union);
        symmetricDifference1.removeAll(intersect);
        printData("(B - A & A - B) other approach Symmetric difference of phone and email contacts", symmetricDifference1);


    }

    public static void printData (String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(25));
        System.out.println(header);
        System.out.println("-".repeat(25));
        contacts.forEach(System.out::println);
    }
}
