package AutoBoxing.Challenge.ChallengeOne;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("bob",500);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A",1000);
        System.out.println(bank);
        bank.addtransaction("jane A", 1500);
        bank.addtransaction("jane a", -1000);
        bank.printStatement("Jane a");
    }
}
