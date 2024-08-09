package JavaLangObjectExample;

public class Main extends Object {
    public static void main(String[] args) {
        Student student = new Student("Mark",18);
        System.out.println(student);

        PrimarySchoolStudent pstudent = new PrimarySchoolStudent("Jimmy","Carol",8);
        System.out.println(pstudent);
    }
}

class Student {
    private String name;
    private int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " +
                 age +
                " years old";
    }
}

class PrimarySchoolStudent extends Student {
    private String parent;

    public PrimarySchoolStudent (String parent, String name, int age) {
        super(name,age);
        this.parent = parent;
    }

    @Override
    public String toString() {
        return parent + "'s kid "
                + super.toString();
    }
}
