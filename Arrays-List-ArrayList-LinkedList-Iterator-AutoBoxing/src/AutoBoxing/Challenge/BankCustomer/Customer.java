package AutoBoxing.Challenge.BankCustomer;

import java.util.ArrayList;

public record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }
}
