# Interface:
- It's similar to abstract class but a special type
- Only abstract classes are allowed within the interface
- interface uses "implements" during inheritance instead of "extends" which is used in class inheritance
- while using implements word, we can inherit multiple interfaces
- We can perform extends and implements on the same class.
- public and abstract keyword for methods within interface is redundant
- static & final for variables or methods within the interface is redundant
- interface cannot "implements" another interface but can "extends" and extended interface methods are not mandatory to implement
- JDK 9 introduced, public (redundant) static methods in interface
  ```
    public interface OrbitEarth extends FlightEnabled{
      void achieveOrbit();
      static void log(String description) {
          var today = new java.util.Date();
          System.out.println(today + ": " + description);
      }
    }
  ```
- final & static variables can be included in interface 
  ```
    public interface FlightEnabled {
      static final double milesToKilometers = 1.60934;
      double kilometersToMiles = 0.621371;
      public abstract void takeOff();  //protected or private not allowed
      abstract void land();
      void fly();
  ```
- we can implement "default" methods inside the interface, the subclass implemented need not use it mandatory & using default keyword in methods create concrete methods with body of the method
  ```
    public interface FlightEnabled {
      static final double milesToKilometers = 1.60934;
      double kilometersToMiles = 0.621371;
      public abstract void takeOff();  //protected or private not allowed
      abstract void land();
      void fly();
    
      default FlightStages transition(FlightStages stage) {
      //        System.out.println("transition not implemented on " + this.getClass().getName());
      //        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
      }
    }
  ```
- JDK 9, gave private static and non-static methods
  - private static method, accessed by public static method, default method, private non-static method
  ```
   public interface Rough {
    void printDetails();

    private void walk() {
        System.out.println("This is a private non-static method");
    }

    private static void sleep() {
        System.out.println("This is a private static method");
    }
   }
  ```
- only public methods is not possible within the interface
  ```
  public interface Rough {
    void printDetails();
    
    public void walk() { => Not possible
    }
  }
  ```
- for interface, we can use a private method inside a private method or default method. 
- To access default methods in another class or interface inherited, we use "super" keyword
  ``` 
  <Interface>.super.<method>();
  
  @Override
    default FlightStages transition(@NotNull FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(nextStage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
  ```