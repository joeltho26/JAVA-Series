package AutoBoxing.Challenge.ChallengeTwo;

import java.util.ArrayList;

public record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialTransactions) {
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transactions.add(initialTransactions);
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

}
