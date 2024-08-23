package NestedClasses.Example.ExampleOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee("Ralph",2015),
                                                            new Employee("Laura",2021),
                                                            new Employee("Jim",2013),
                                                            new Employee("Rooney",2020),
                                                            new Employee(10001,"Mary",2018),
                                                            new Employee("Lucy",2023)));

        employees.sort(new Employee.EmployeeComparator<>());
        employees.sort(new Employee.EmployeeComparator<>("employeeId").reversed());

        for(var employee: employees) {
            System.out.println(employee);
        }

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(new StoreEmployee("Ralph",2015,"Zalando"),
                new StoreEmployee(10015,"Laura",2021,"Walmart"),
                new StoreEmployee("Jim",2013),
                new StoreEmployee("Rooney",2020,"Macys"),
                new StoreEmployee(10001,"Mary",2018,"Target"),
                new StoreEmployee("Lucy",2023,"Debenhams")));

        StoreEmployee.StoreComparator<StoreEmployee> comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for(var employee: storeEmployees) {
            System.out.println(employee);
        }

    }
}
