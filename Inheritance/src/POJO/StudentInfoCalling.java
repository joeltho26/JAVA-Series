package POJO;

public class StudentInfoCalling {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            StudentInfo student = new StudentInfo("1324"+i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Robert";
                        case 4 -> "Luke";
                        case 5 -> "Cecil";
                        default -> "Invalid";
                    },"18-02-1992".substring(0,9) + (Integer.parseInt("18-02-1992".substring(9))+i),
                    "JavaMasterclass");
            System.out.println(student);
            System.out.println(student.getClass().getSimpleName());
            System.out.println(student.name());
        }
    }

}
