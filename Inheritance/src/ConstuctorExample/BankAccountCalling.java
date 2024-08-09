package ConstuctorExample;

public class BankAccountCalling {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getAccountBalance());
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getEmail());
        System.out.println(bank.getPhoneNumber());
        System.out.println("----------");
        BankAccount bank2 = new BankAccount("Mark","mark@gmail.com","837991831");
        System.out.println(bank2.getAccountNumber());
        System.out.println(bank2.getAccountBalance());
        System.out.println(bank2.getCustomerName());
        System.out.println(bank2.getEmail());
        System.out.println(bank2.getPhoneNumber());
        System.out.println("----------");
        BankAccount bank3 = new BankAccount(24898824,1000,"Mark","mark@gmail.com","837991831");
        System.out.println(bank3.getAccountNumber());
        System.out.println(bank3.getAccountBalance());
        System.out.println(bank3.getCustomerName());
        System.out.println(bank3.getEmail());
        System.out.println(bank3.getPhoneNumber());
        System.out.println("----------");
        BankAccount bank4 = new BankAccount("Luke","luke@gmail.com","197988731");
        System.out.println(bank4.getAccountNumber());
        System.out.println(bank4.getAccountBalance());
        System.out.println(bank4.getCustomerName());
        System.out.println(bank4.getEmail());
        System.out.println(bank4.getPhoneNumber());
    }
}
