package ArrayList.ArrayListChallenge.MobilePhone;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Contract(value = "_, _ -> new", pure = true)
    public static @NotNull Contact createContact (String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }

    @Override
    public String toString() {
        return getName() + "-->" + getPhoneNumber();
    }
}
