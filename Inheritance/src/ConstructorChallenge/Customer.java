package ConstructorChallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Dummy",0.0,"dummy@gmail.com");
    }

    public Customer (String name,String email) {
        this(name,500,email);
    }

    public Customer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        emailAddress = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
