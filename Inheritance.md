# Inheritance:
- the process of extending the parent class to child class and vice versa.
- to inherit a parent class child class should use "extends" keyword
- the child class can inherit only one parent class at a time
- Except private variables and methods, all the other types can be accessed in the subclass inheriting the parent class
  ```
    public class One {
    ....
    ......
    ......... 
    }
  
    public class Two extends One  {
    ....
    ......
    ......... 
    }
  ```
- imagine "class LpaStudents extends Students" then,
  - List<'Students'> students = new ArrayList<>(new Students()) => works
  - List<'LpaStudents'> students2 = new ArrayList<>(new LpaStudents()) => works
  - List<'Students'> students3 = new ArrayList<>(new LpaStudents()) => works
  - List<'LpaStudents'> students4 = new ArrayList<>(new Students()) => not work
- The above rule will apply the same for method parameters as well.
  - We can also use raw use of class like 'void printValues (List values) {}
##### Note:
- we can also use "super()" keyword to access parent class constructor
- We can generalize methods with the inheritance of parent class parameters like 
  ```
    public class Animal {
      .....
      .......
      ..........
     }
  
    public class Cat extends Animal {
      .....
      .......
      ..........
     }
  
    public class Dog extends Animal{
      ....
      ......
      ........
     }
  
    public static void animalActivity (Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
        System.out.println("--------");
     }
  
  ```
- Then we can write a generalized method for Animal class, Dog class, Cat class since all the 3 classes have Animal class inherited like shown above.
- By checking className() based on the instanceof operator, we can call methods that belong to the particular subclass of Animal class like Dogs and Cats.
- Otherwise, we can only access Animal methods 
- Animal methods can be overridden by the subclass
- If subclass doesnt have the method created, the parent class method will be invoked automatically during compile time.