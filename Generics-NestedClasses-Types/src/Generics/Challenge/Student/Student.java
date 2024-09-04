package Generics.Challenge.Student;

import java.util.Comparator;
import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private static int lastID = 10_000;
    private int studentID;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstnames = {"Ann","Bill","Cathy","John","Tim"};
    private static String[] courses = {"C++","Java","Python"};

    public Student() {
        studentID = lastID++;
        int lastNameIndex = random.nextInt(65,91);
        name = firstnames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentID,name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fname = fieldName.toUpperCase();
        return switch (fname) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == Integer.valueOf(value);
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentID).compareTo(Integer.valueOf(o.studentID));
    }
}
