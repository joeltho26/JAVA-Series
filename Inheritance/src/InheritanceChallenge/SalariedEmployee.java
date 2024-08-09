package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private boolean isRetired;
    private double annualSalary;

    public SalariedEmployee(String hireDate, long employeeId, boolean isRetired, double annualSalary) {
        super(hireDate,employeeId);
        this.isRetired = isRetired;
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String hireDate, double annualSalary) {
        super(hireDate);
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(double annualSalary) {
        this("01-01-2013",annualSalary);
    }

    public boolean isRetired() {
        return isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "isRetired=" + isRetired +
                ", annualSalary=" + annualSalary +
                "} " + super.toString();
    }

    @Override
    double collectPay() {
        double payCheck = annualSalary/26;
        double adjustedPayCheck = isRetired ? 0.9*payCheck: payCheck;
        return (int) adjustedPayCheck;
    }

    void retire() {
        terminate("12-12-2025");
        isRetired=true;
    }
}
