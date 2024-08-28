package NestedClasses.Challenge.ChallengeThree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var employees = new ArrayList<Employee> (List.of(
                    new Employee("Minnie", "Mouse", "01/02/2023"),
                    new Employee("Mickey", "Mouse", "28/11/2022"),
                    new Employee("Duffy", "Duck", "17/03/2024"),
                    new Employee("Goofy", "Dog", "23/06/2023"),
                    new Employee("Donald", "Duck", "11/12/2021")
        ));
        printOrderedList(employees,"years");
    }

    public static void printOrderedList(List<Employee> employees, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                this.yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                this.fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName,yearsWorked);
            }
        }

        List<MyEmployee> myEmployeeList = new ArrayList<>();
        for(Employee emp: employees) {
            myEmployeeList.add(new MyEmployee(emp));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equalsIgnoreCase("fullname")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        myEmployeeList.sort(comparator);
        for(MyEmployee employee: myEmployeeList) {
            System.out.println(employee);
        }

    }
}
