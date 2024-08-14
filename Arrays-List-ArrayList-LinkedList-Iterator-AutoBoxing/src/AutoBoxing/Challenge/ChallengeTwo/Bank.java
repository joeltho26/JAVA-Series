package AutoBoxing.Challenge.ChallengeTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            System.out.println("Branch Added: " + branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransactionAmount) {
        Branch branch = findBranch(branchName);
        System.out.println(branch);
        if (branch != null) {
            return branch.newCustomer(customerName,initialTransactionAmount);
        } else {
            System.out.println("Branch not found");
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,transactionAmount);
        } else {
            System.out.println("Branch not found");
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (var branch: branches) {
            if (branch.name().equalsIgnoreCase(branchName)) {
                System.out.println("Branch found!");
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            if (printTransaction) {
                ArrayList<Customer> customers = branch.customers();
                for (var customer : customers) {
                    System.out.println("-".repeat(30));
                    System.out.println("Customer name: " + customer.name());
                    System.out.println("Transactions:");
                    for (var transaction : customer.transactions()) {
                        System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
                    }
                }
            }
            return true;
        } else {
            System.out.println("Branch not found");
        }
        return false;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", -12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
