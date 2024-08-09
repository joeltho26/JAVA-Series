package ConstructorChallenge;

public class CustomerCalling {
    public static void main(String[] args) {
        Customer cust = new Customer("Mary",1000,"mary@gmail.com");
        System.out.println(cust.getName());
        System.out.println(cust.getCreditLimit());
        System.out.println(cust.getEmailAddress());
        System.out.println("--------");
        Customer cust2 = new Customer();
        System.out.println(cust2.getName());
        System.out.println(cust2.getCreditLimit());
        System.out.println(cust2.getEmailAddress());
        System.out.println("--------");
        Customer cust3 = new Customer("Mathew","mathew@gmail.com");
        System.out.println(cust3.getName());
        System.out.println(cust3.getCreditLimit());
        System.out.println(cust3.getEmailAddress());
    }
}
