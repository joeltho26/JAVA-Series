package NestedClasses.Example.ExampleOne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {
    static String word = "Hello";
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee("Ralph",2015),
                new Employee("Laura",2021),
                new Employee("Jim",2013),
                new Employee("Rooney",2020),
                new Employee(10001,"Mary",2018),
                new Employee("Lucy",2023)));

        List<StoreEmployee> storeEmployees = new ArrayList<>(
                List.of(
                        new StoreEmployee("Ralph",2015,"Zalando"),
                        new StoreEmployee(10015,"Laura",2021,"Walmart"),
                        new StoreEmployee("Jim",2013),
                        new StoreEmployee("Rooney",2020,"Macys"),
                        new StoreEmployee(10001,"Mary",2018,"Target"),
                        new StoreEmployee("Lucy",2023,"Debenhams")));

        var c0 = new EmployeeComparator<StoreEmployee>();
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        class nameSort<T> implements Comparator<StoreEmployee> {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c3 = new nameSort<StoreEmployee>();

        // Anonymous class
        var c4 = new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(storeEmployees,c0);
        sortIt(employees,c0);

        sortIt(storeEmployees,c1);
        sortIt(employees,c1);

        sortIt(storeEmployees,c2);
        //sortIt(employees,c2); since employee type is not relevant with c2 comparator of Store Employee.

        sortIt(storeEmployees,c3);
//        sortIt(employees,c3); since employee type is not relevant with c3 comparator of Store Employee.

        sortIt(storeEmployees,c4);

        sortIt(storeEmployees,new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with comparator: " + comparator.toString());
        list.sort(comparator);
        for(var emp: list) {
            System.out.println(emp);
        }
    }
}
