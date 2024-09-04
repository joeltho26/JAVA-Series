package Generics.Example.ComparatorComparable.ComparatorAndComparable.Comparable;

import java.util.Random;

public class Student implements Comparable<Student> {
    private static int lastID = 1000;
    private static Random random = new Random();

    public String name;
    private int id;
    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = lastID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
//        return name;
        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }

    @Override
    public int compareTo(Student o) {
//        return name.compareTo(o.name);
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

}
