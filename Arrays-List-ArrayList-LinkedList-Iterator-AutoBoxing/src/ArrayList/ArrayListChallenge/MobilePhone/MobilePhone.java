package ArrayList.ArrayListChallenge.MobilePhone;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone extends Contact {
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(@NotNull Contact contact) {
        this(contact.getName(),contact.getPhoneNumber());
        myContacts.add(contact);
    }

    public MobilePhone(String name, String phoneNumber) {
        super(name,phoneNumber);
        myContacts.add(Contact.createContact(name,phoneNumber));
    }

    public void addNewContact(Contact contact) {
        if (findContact(contact)>=0) {
            System.out.println("Contact " + contact.getName().toLowerCase() + " already present!");
        } else {
            myContacts.add(contact);
            System.out.println("New Contact " + contact.getName().toLowerCase() + " added!");
        }
    }

    public void updateContact(Contact contactOld, Contact contactNew) {
        if (findContact(contactOld)>=0) {
            removeContact(contactOld);
            myContacts.add(contactNew);
            System.out.println("Contact " + contactOld.getName().toLowerCase() + " updated to " + contactNew.getName().toLowerCase());
        } else {
            System.out.println("No Contact to update!");
        }
    }

    public void removeContact(Contact contact) {
        if (findContact(contact)>=0) {
            myContacts.remove(contact);
            System.out.println("Contact " + contact.getName().toLowerCase() + " removed!");
        } else {
            System.out.println("No Contact to remove!");
        }
    }

    public int findContact(Contact contact) {
        for (Contact contactItem: myContacts) {
            if (contactItem.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return myContacts.indexOf(contactItem);
            }
        }
        return -1;
    }

    public int findContact(String phoneNumber) {
        for (Contact contactItem: myContacts) {
            if (contactItem.getPhoneNumber().equals(phoneNumber)) {
                return myContacts.indexOf(contactItem);
            }
        }
        return -1;
    }

    public ArrayList<Contact> queryContact(String name) {
        var queriedContacts = new ArrayList<Contact>();
        for (Contact contactItem: myContacts) {
            if (contactItem.getName().contentEquals(name)) {
                queriedContacts.add(contactItem);
            }
        }
        return queriedContacts;
    }

    public void printContact() {
        if (!myContacts.isEmpty()) {
            for (Contact contactItem : myContacts) {
                System.out.println(contactItem.getName() + " --> " + contactItem.getPhoneNumber());
            }
        } else {
            System.out.println("Contacts list is emtpy!");
        }
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Help Service","111");
        Contact alice = Contact.createContact("Alice","16180339");
        Contact jane = Contact.createContact("Jane","23571113");
        Contact tom = Contact.createContact("Tom","11235813");
        Contact robert = Contact.createContact("Robert","26170339");
        Contact robin = Contact.createContact("Robin","26190449");
        Contact katherine = Contact.createContact("Katherine","24170939");
        Contact tom2 = Contact.createContact("Tom","24196239");

        phone.addNewContact(alice);
        phone.addNewContact(jane);
        phone.addNewContact(tom);
        phone.addNewContact(robert);
        phone.addNewContact(katherine);
        phone.addNewContact(tom2);

        System.out.println(phone.findContact(katherine));
        System.out.println(phone.findContact("11235813"));

        phone.printContact();
        System.out.println(Arrays.toString(phone.queryContact("Tom").toArray()));

        phone.removeContact(tom2);
        phone.printContact();

        phone.updateContact(robert,robin);
        phone.printContact();
    }
}
