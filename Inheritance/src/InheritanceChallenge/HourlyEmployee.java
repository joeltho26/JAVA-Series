package InheritanceChallenge;

public class HourlyEmployee extends Employee {
    double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name,birthDate,hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee (double hourlyPayRate) {
        super("Dummy");
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    @Override
    double collectPay() {
        return 40*hourlyPayRate;
    }

    double getDoublePay() {
        return 2 * collectPay();
    }
}
