package PersonChallenge;

public class PersonCalling {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Mark");
        person.setLastName("");
        person.setAge(18);
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
        System.out.println("------");
        person.setLastName("Antony");
        System.out.println(person.getFullName());
        System.out.println("------");
        person.setFirstName("");
        person.setAge(22);
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.getFullName());

    }
}
