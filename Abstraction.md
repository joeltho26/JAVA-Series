# Abstraction:
- abstraction can be applied to class and also method.
- abstract class can be accessed via inheritance and not through instances. Abstract class should have atleast one abstract method inside of it.
- abstract method is method without any code in the body
- we say abstract method as unimplemented method
- a concrete method has body with at least one line of code. A concrete method implements an abstract method, if it overrides one.
- an abstract class can inherit another abstract class then the abstract methods are not mandatory to override but from abstract class to non-abstract class then its absolutely necessary to implement the abstract methods
- abstract class (with few abstract methods) -> abstract class inherits abstract class (with additional abstract methods) -> non-abstract class inherit the nearest abstract class which also has a parent abstract class. So its necessary to implement all the abstract methods in both the abstract classes. 
- whereas, if non-abstract class inherits abstract class with no parent class for the abstract class, or it's parent class is not abstract class then we need to only implement the methods from the abstract class as mandatory.
- when abstract class "implements" interface, then interface methods are not mandatory to implement in abstract class

### Abstraction vs Encapsulation:
- Abstraction is the method of hiding the unwanted information. Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside
