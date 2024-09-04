package AutoBoxing.Challenge.BankCustomer2;

import java.util.ArrayList;

public record Branch(String name, ArrayList<Customer> customers) {

    public Branch(String name) {
        this(name, new ArrayList<>(500));
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            Customer customer = new Customer(name,initialTransaction);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for (var customer: customers) {
            if (customer.name().equalsIgnoreCase(name)) {
                System.out.println("Customer found!");
                return customer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
