package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee joe = new Employee("01-01-2020");
        System.out.println(joe);
        System.out.println(joe.getAge());
        System.out.println(joe.collectPay());

        Employee mark = new Employee("01-01-2022");
        System.out.println(mark);
//
        SalariedEmployee john = new SalariedEmployee("01-01-2021",35000);
        System.out.println(john);

        SalariedEmployee simon = new SalariedEmployee(55000);
        System.out.println(simon);

        SalariedEmployee bethy = new SalariedEmployee("01-01-2021",75000);
        System.out.println(bethy);
        System.out.println(bethy.collectPay());

        SalariedEmployee claire = new SalariedEmployee("01-01-2021",75000);
        System.out.println(claire);
        claire.retire();
        System.out.println(claire.collectPay());

        HourlyEmployee mary = new HourlyEmployee(15.75);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());

    }
}
