package Example.HashSet.Contacts;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();


    public Contact(String name) {
        this(name,0);
    }

    public Contact(String name, String email) {
        this(name,email,0);
    }

    public Contact(String name, long phone) {
        this(name,null,phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if (email != null) {
            this.emails.add(email);
        }
        if (phone > 0) {
            String phoneNumber = String.valueOf(phone);
            phoneNumber = "(%s) %s-%s".formatted(
                    phoneNumber.substring(0,3),
                    phoneNumber.substring(3,6),
                    phoneNumber.substring(6));
            this.phones.add(phoneNumber);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name,emails,phones);
    }

    // while using java.utils.objects.equals() by selecting only name as the non-null values in the 3rd tab in the option
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact = (Contact) o;
//        return getName().equals(contact.getName()) &&
//                Objects.equals(emails, contact.emails) &&
//                Objects.equals(phones, contact.phones);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), emails, phones);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

    public void addEmail(String companyName) {
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.toLowerCase().charAt(0),names[names.length -1].toLowerCase(),
                companyName.replaceAll(" ", "").toLowerCase());
        if(!emails.add(email)) {
            System.out.println(email + " already has the email for " + name);
        } else {
            System.out.println(email + " has been added for " + name);
        }
    }

    public void replaceEmailIfExists(String oldEmail, String newEmail) {
        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }

}
