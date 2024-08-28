package NestedClasses.Example.ExampleOne;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<StoreEmployee> storeEmployees = new ArrayList<>(
                List.of(
                new StoreEmployee("Ralph",2015,"Zalando"),
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
        System.out.println("With Pig Latin Names:");
        pigLatinName(storeEmployees);
    }

    public static void pigLatinName(List<? extends StoreEmployee> list) {
        String lastname = "Piggy";
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {
            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastname;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(@NotNull DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for (var employee: list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin,employee));
        }
        // lastname = "Latin"; => not allowed since variables are final.
        newList.sort(null);
        for(var emp : newList) {
            System.out.println(emp.originalInstance.getName() + " " + emp.pigLatinName);
        }
    }
}
