# Annotations:
- they are used to describe what a method or a class is performing
- metadata
- used by compiler and other preprocessing types of function
- they are written starting with @ and followed by operation name.
  ```
    class Student {
     private int id;
     private String name;
     private String dateOfBirth;
     private String classList;

     @Override   ==> Annotation
     public String toString() {
         return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
     }
  ```