# POJO (Plain Old Java Object)
- mainly used when storing or retrieving data from the database
- class that has only an instance field, setter methods, getter methods & few other methods like toString.

## Record:
- A Record type which is similar like class that simplifies the POJO creation.
- they have built in constructors, getters, toString methods and more.
- called as plain data carriers or Java Beans.
- We cannot use setters in Record or try to update the value using setters. This is by design to avoid malicious update.
- getter methods eg: id(), name() is a valid way of calling field accessor methods and not getId()
  ```
    public record StudentInfo(String id, String name, String dateOfBirth, String classList) {
        } 
  ```