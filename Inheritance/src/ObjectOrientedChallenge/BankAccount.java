package ObjectOrientedChallenge;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String emailID) {
        email = emailID;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double value) {
        System.out.println("+" + value + " is being deposited");
        this.accountBalance += value;
        checkBalance();
    }

    public void withdrawFunds (double value) {
        System.out.println("-" + value + " is being withdrawn");
        if (value > accountBalance) {
            System.out.println("Insufficient Balance to withdraw " + value + ". Please try to withdraw within the value of account balance");
        } else {
            this.accountBalance -= value;
            checkBalance();
        }
    }

    public void checkBalance () {
        System.out.println("The account balance is " + this.accountBalance);
        if (this.accountBalance < 0) {
            System.out.println("Please pay the outstanding balance of " + this.accountBalance);
        }
    }
}
