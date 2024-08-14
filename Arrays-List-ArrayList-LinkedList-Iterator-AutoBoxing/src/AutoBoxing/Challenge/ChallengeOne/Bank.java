package AutoBoxing.Challenge.ChallengeOne;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(500);
    }

    public Customer getCustomers(String name) {
        for (var customer: customers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer %s not found %n",name);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomers(customerName)==null) {
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New customer added " + customer);
        }
    }

    public void addtransaction(String name, double transactionAmount) {
        Customer customer = getCustomers(name);
        if (customer!=null) {
            customer.transaction().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomers(customerName);
        if (customer==null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions:");
        for (double amount : customer.transaction()) {
            System.out.printf("$%10.2f (%s)%n",amount,amount<0? "debit":"credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

}
