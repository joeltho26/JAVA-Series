package Generics.Example.ComparatorComparable.ComparatorAndComparable;

import Generics.Example.ComparatorComparable.ComparatorAndComparable.Comparable.Student;
import Generics.Example.ComparatorComparable.ComparatorAndComparable.Comparator.StudentGPAComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};
        for (var i: others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d, value is %d %n",five,(val==0)?"==":val<0?"<":">",i,val);
        }

        String banana = "banana";
        String[] fruit = {"apple","banana","pear","BANANA"};
        for (var i: fruit) {
            int val = banana.compareTo(i);
            System.out.printf("%s %s %s, value is %d %n",banana,(val==0)?"==":val<0?"<":">",i,val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        Student student = new Student("Tim");
        Student[] students = new Student[] {new Student("Zack"),new Student("Tobby"), new Student("Anne")};
//        Arrays.sort(students);
        //System.out.println("Result= " + student.name.compareTo("Mary"));
        System.out.println("Result= " + student.compareTo(new Student("Mark")));

        var gpaSorter = new StudentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));

    }
}

