package InheritanceChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    static int employeeNumber = 1;

    public Employee(String name, String birthDate, String hireDate, long employeeId) {
        super(name,birthDate);
        this.hireDate = hireDate;
        if (employeeId <= employeeNumber) {
            this.employeeId = employeeId;
            Employee.employeeNumber++;
        } else {
            throw new IllegalStateException("Employee ID not present! Last Employee ID: " + (Employee.employeeNumber - 1));
        }
    }

    public Employee(String name, String birthDate, String hireDate) {
        this(name,birthDate,hireDate,Employee.employeeNumber);
    }

    public Employee(String hireDate, long employeeId) {
        this("Dummy","01-01-1970",hireDate,employeeId);
    }

    public Employee() {
        this("Dummy","01-01-1970","01-08-2024",Employee.employeeNumber);
    }

    public Employee(String hireDate) {
        this("Dummy","01-01-1970",hireDate,Employee.employeeNumber);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
