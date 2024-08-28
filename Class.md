# Class:
- like a special data type which includes methods like non-primitive data types
- we can create static and non-static classes (creating instance of a class)
- when a class field is static (variables) then it has only one memory address, and it's associated with the class
- when a class field is non-static (variables) then everytime when we create instance of class it creates a new memory address for the field variables of the class.
- static fields can be used in both static and non-static methods in a class both internal(same class) and external(inherited class or outside class)
----
## Class Modifiers:
- #### Access Modifiers:
  - ##### public:
    - Any other classes can access the class defined with public keyword modifier.
  ```
    public className {
     }
  ```
  - ##### default (class without Access Modifier keyword [package private])
    - Only by classes within the same package
  ```
    className {
     }
  ```
-----
- #### Non-Access Modifiers:
  - ##### final:
    - class with final keyword will not be inherited
  ```
    final className {
     }
  ```
  - ##### abstract:
    - class with abstract keyword cannot have instance of a class (object) created but can be accessed via inheritance by subclass (child class)
    - abstract class should have atleast one abstract method and other regular methods can be used. 
  ```
    abstract className {
     }
  ```
-----
## "this" keyword:
- Used in class field while updating the values with the same field name in the parameter of a method. In this context, this refers to the object/instance of the class
  ```
  Class Car {
    private String make;
    private String model;
  
    public void setMake (String make) {
        this.make = make;
     }
  
  OR 
  
    public void setModel (String modelName) {
        model = modelName;
     }
  }
  ```
------
#### Note:
- Any class in java belongs to java.lang.object
- to check, click code and select override methods. you can see methods displayed
- Object -> Any class created or in-built (String,etc.)
- Methods of Object: getClass(),equals(),toString(),hashCode(),notify(),wait(),etc.
- To read more on the declaration, right-click and select option "Go To -> Declaration or Usages"
  ```
    public class Main extends java.lang.Object {
      public static void main(String[] args) {

      }
    }
  
  OR 
  
    public class Main extends Object {
      public static void main(String[] args) {

      }
    }
  
  ```
-----
##### Note:
- In Java, we can create multiple classes under the same file but only class should be made public and, it followed by the filename.
