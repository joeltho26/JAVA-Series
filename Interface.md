# Interface:
- It's similar to abstract class but a special type
- Only abstract classes are allowed within the interface
- interface uses "implements" during inheritance instead of "extends" which is used in class inheritance
- while using implements word, we can inherit multiple interfaces
- We can perform extends and implements on the same class.
- public and abstract keyword for methods within interface is redundant
- static & final for variables or methods within the interface is redundant
- interface cannot "implements" another interface but can "extends" and extended interface methods are not mandatory to implement
- JDK 9 introduced, public static methods in interface
- final & static variables can be included in interface 

  ```
    public interface OrbitEarth extends FlightEnabled{
      void achieveOrbit();
      static void log(String description) {
          var today = new java.util.Date();
          System.out.println(today + ": " + description);
      }
    }
  ```
- we can implement "default" methods inside the interface which the "implement" subclass need not use it mandatory & using default keyword in methods create concrete methods with body of the method
  
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