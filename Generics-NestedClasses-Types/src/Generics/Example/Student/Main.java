package Generics.Example.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i=0; i<studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent()); // This is possible
         printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i=0; i<studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printMoreList(lpaStudents); // This is not possible unless we make raw List parameter in printList method.

        testList(new ArrayList<>(List.of("apple","banana","lemon")));
        testList(new LinkedList<>(List.of(1,2,3,4)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreList(matches);

        var students2021 = QueryList.getMatches(students,"yearStarted", "2021");
        printMoreList(students2021);

        var students2022 = QueryList.<Student>getMatches(new ArrayList<>(),"yearStarted", "2022");
        printMoreList(students2022);
    }

//    public static void printList(List<Student> students) {
//        for(var student: students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    public static <T extends Student> void printList(List<T> students) {
        for(var student: students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void printMoreList(List<? extends Student> students) {
//        Student last = students.get(students.size()-1);
//        students.set(0,last); => not possible since using wildcards, it could be Student or LPAStudent type but compiler dont know, so its not allowed and wont work
        for(var student: students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

//    public static void testList(List<String> list) {  // => when implementing below method it errors with type erasure, to avoid such collision used bounded generics
//        for(var ele: list) {
//            System.out.println("String " + ele.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//        for(var ele: list) {
//            System.out.println("Integer " + ele.floatValue());
//        }
//    }

    public static void testList(List<?> list) {
        for(var ele: list) {
            if (ele instanceof String elementStr) {
                System.out.println("String " + elementStr.toUpperCase());
            } else if(ele instanceof Integer elementInt) {
                System.out.println("Integer " + elementInt.floatValue());
            }
        }
    }
}
