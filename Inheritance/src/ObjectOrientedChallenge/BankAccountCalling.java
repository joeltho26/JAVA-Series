package ObjectOrientedChallenge;

public class BankAccountCalling {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setCustomerName("John Martin");
        bank.setAccountBalance(10000);
        bank.setAccountNumber(35226461);
        bank.setEmail("johnmartin096@gmail.com");
        bank.setPhoneNumber("9791096218");
        bank.checkBalance();
        bank.withdrawFunds(8000);
        bank.depositFunds(2500);
        bank.withdrawFunds(5000);
    }
}
