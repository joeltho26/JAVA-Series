# Class:
- like a special data type which includes methods like non-primitive data types
- we can create static and non-static classes (creating instance of a class)
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