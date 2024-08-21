# Generics:
- java supports generic types such as classes, records, interface, generic methods
- T in the below example is the placeholder for type.
  ```
  class Main<T> {
    private T field;
  }
  
  (OR)
  
  class Main<T,S,U,V> { 
    private T field;
  }
  
  ArrayList<String> items;
  // String => type parameter
  // ArrayList => reference type
  // items => variable name
   ```
- Reserved keywords in generics:
  - V => Value
  - T => type
  - K => Key
  - E => Element
  - N => Number
  - S,U,V => 2nd, 3rd, 4th types
  
- Upper bounds in generics:
  - allows only class which implemented Player interface or class
  ```
  <T extends Player> => (Upper Bounds)
  
  public class Team<T extends Player> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMembers(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }
  
  //Allowed implementation:
   Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
   var tex = new FootballPlayer("Tex Walker", "Centre Half Forward");
  
  
   public record FootballPlayer(String name, String position) implements Player {
    }
  
  
  //Not Allowed:
   Team<String> adelaide = new Team<>("Adelaide Storms");
   adelaide.addTeamMembers("N Robert");
  ```
- Comparable:

```
  public interface Comparable<T> {
   int compareTo(T o);
  }
```
- List<Student> in variables or method parameters
  - Only List subtypes are accepted like ArrayList, LinkedList, etc & Student sublist is not allowed here like lpaStudent (subclass of Student)
- (unbounded) => List of any type using wildcard
- (upper bound) => List of Student type or subtype of Student using wildcard
- (lower bound) => List of super type of LPAStudent i.e. Student & Object using wildcard
  ```
   List<? super LPAStudent> => (lower bound)
   List<? extends Student> => (upper bound)
   List<?> => (unbounded)
  ```
- to use multiple upper bounds
  ```
   public class GenericClass<T extends AbstractClassA & InterfaceA & interfaceB>
  
   public class QueryList <T extends Student & Comparable & QueryItem>
  ```
    - extends used for both class and interface
    - maximum extends one class and zero to multiple interface at once
    - class first and then followed by interfaces.