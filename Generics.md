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

- use generics when we need to apply rules to define what specific object are permitted to insert and not, into a list by defining it type like below Team<"BaseBallPlayer"> = new Team("LA Raptors")
- besides, the methods related to the specific types cannot be accessed or used with general type T as the generic.
  ```
   public class Team<T> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    
    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        for (var member: teamMembers) {
         System.out.println(member.name()) => name() will not work since T is general and since String is also accepted.
       }
    }
    
    public static void main(String[] args) {
        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
        var harper = new BaseballPlayer("B Harper","Right Fielder");
        var marsh = new BaseballPlayer("B Marsh","Right Fielder");
        phillies.addTeamMembers(harper);
        phillies.addTeamMembers(marsh);
    
    //Not Allowed (since tex is of FootballPlayer type & not BaseballPlayer type):
        var tex = new FootballPlayer("Tex Walker", "Centre Half Forward");
        phillies.addTeamMembers(tex); => since it of FootballPlayer type & not BaseballPlayer type
  
    //Issues (need to be fixed by using upper bounds in generics):
        Team<String> adelaide = new Team<>("Adelaide Strikers");
        adelaide.addTeamMembers("N Robert");
      }
    }
  ```
- Upper bounds in generics:
  - allows only class which implemented the Player interface or class
  - other words, T must be a type of Player or subtype (inherited class or implemented interface) of Player
  ```
  // <T extends Player> => (Upper Bounds)
  
  public interface Player {
    String name();
    }
  
  public record FootballPlayer(String name, String position) implements Player {
    }
  
  public record BaseballPlayer(String name, String position) implements Player {
    }
  
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
  
  //Not Allowed:
   Team<String> adelaide = new Team<>("Adelaide Storms");
   adelaide.addTeamMembers("N Robert");
  ```
- with T & S
  ```
  public interface Player {
    String name();
  }
  
  public record FootballPlayer(String name, String position) implements Player {
    
  }
  
  public record BaseballPlayer(String name, String position) implements Player {
    
  }


  public record Affiliation(String name, String type, String countryCode) {
    @override
    public String toString() {
      return name() + " (" + type() + " in " + countryCode() + ")";
    }
  }
  
  public class Team<T extends Player, S> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMembers(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }
    
    public void listTeamMembers() {
        System.out.print(teamName + " Roster: ");
        for (var member: teamMembers) {
         System.out.print(member.name() + " (");
         System.out.print(affliation==null? "": affiliation + ")");
       }
    }
  }
  
  //Allowed implementation:
   Team<FootballPlayer> afc = new Team<>("Adelaide Crows","Adelaide");
   var tex = new FootballPlayer("Tex Walker", "Centre Half Forward");
  ```
- Sometimes, we can T[] instead of List<'T'> but [] is an array whereas List<'T'> is a type from Collection framework
- Comparable (uses compareTo() method)
- RAW use of Comparable (not recommended):
  ```
  public class Student implements Comparable {
    
    public String name;
    private int id;
    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = lastID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }
  
    @Override
    public int compareTo(Object o) {
      Student other = (Student) o;
      return name.compareTo(other.name);
    }
  }
  
  public class Main {
    public static void main(String[] args) {
  
      Student student = new Student("Tim");
      Student[] students = new Student[] {new Student("Zack"),new Student("Tobby"), new Student("Anne")};
      
      // Allowed:
      Arrays.sort(students);
  
      // Allowed (run-time error): 
      // Since the comparable method casts to Student, but the given argument "Mary" to compare is a string
      // no error when compiled but error during run-time
      System.out.println("Result= " + student.compareTo("Mary")); 
    }
  }
  ```
- Better use of Comparable:
  ```
  public class Student implements Comparable<Student> {
    
    public String name;
    private int id;
    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = lastID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }
  
    @Override
    public int compareTo(Student o) {
      return name.compareTo(o.name);
    }
  }
  
  public class Main {
    public static void main(String[] args) {
  
      Student student = new Student("Tim");
      Student[] students = new Student[] {new Student("Zack"),new Student("Tobby"), new Student("Anne")};
      
      // Allowed:
      Arrays.sort(students);

      //Not Allowed:
      System.out.println("Result= " + student.compareTo("Mary")); 

      //Allowed:
      System.out.println("Result= " + student.compareTo(new Student("Mary"))); 

    }
  }
  ```
- same type erasure:
  ```
  public class Student implements Comparable<Student> {
    
    public String name;
    private int id;
    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = lastID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }
     
    // Same Erasure error: (solution, we comment out one method)
    // the compiler confused at which method to invoke while Arrays.sort()
    @Override
    public int compareTo(Object o) {
      Student other = (Student) o;
      return name.compareTo(o.name);
    }
  
    @Override
    public int compareTo(Student o) {
      return name.compareTo(o.name);
    }
  
    //used for integer => id
    @Override
    public int compareTo(Student o) {
      return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
  }
  
  public class Main {
    public static void main(String[] args) {
  
      Student student = new Student("Tim");
      Student[] students = new Student[] {new Student("Zack"),new Student("Tobby"), new Student("Anne")};
      
      // Allowed:
      Arrays.sort(students);

    }
  }
  ```
- Comparator: (uses compare() method)
- comparator usually used as nested class
  ```
  public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
  }
  
  public class Student implements Comparable<Student> {
    
    public String name;
    private int id;
    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = lastID++;
        this.gpa = random.nextDouble(1.0,4.0);
    }
     
    // Same Erasure error: (solution, we comment out one method)
    // the compiler confused at which method to invoke while Arrays.sort()
    @Override
    public int compareTo(Object o) {
      Student other = (Student) o;
      return name.compareTo(o.name);
    }
  
    @Override
    public int compareTo(Student o) {
      return name.compareTo(o.name);
    }
  
    //used for integer => id
    @Override
    public int compareTo(Student o) {
      return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
  }
  
  public class Main {
    public static void main(String[] args) {
  
      Student student = new Student("Tim");
      Student[] students = new Student[] {new Student("Zack"),new Student("Tobby"), new Student("Anne")};
      
      // Allowed:
      Arrays.sort(students);
  
      // To use comparator method:
      Comparator<Student> gpaSorter = new StudentGPAComparator();
      Arrays.sort(students,gpaSorter);

    }
  }
  ```
- To reverse the comparator, either change from o1.name().compare.o2.name() to o2.name().compare.o1.name() or use gpaSorted.reversed() method
- List<'Student'> in variables or method parameters
  - Only List subtypes are accepted like ArrayList, LinkedList, etc. & Student sublist is not allowed here like lpaStudent (subclass of Student)
  - eg:
    - imagine "class LpaStudents extends Students" then,
      - List<'Students'> students = new ArrayList<>(new Students()) => works
      - List<'LpaStudents'> students2 = new ArrayList<>(new LpaStudents()) => works
      - List<'Students'> students3 = new ArrayList<>(new LpaStudents()) => works
      - List<'LpaStudents'> students4 = new ArrayList<>(new Students()) => not work
- when there is static generic method, we use,
  - static <'T'> void detailsPrint(List<'T'> students)
    - but using T will include all kinds of types even strings, etc.
    - whereas "static <'T' extends Student> void detailsPrint(List<'T'> students)" in method means the method body can access all Student methods and variables as well even if it's private
- generic methods used for static method on generic class, because static methods cant use class type methods
- generic methods type parameter different from class type parameter
- generic methods used for non-generic class as well to enforce rules
- wildcards in generics:
  - public static void printMoreList(List<? extends Student> students)
  - can be used only in type argument and not declarations:
    - List<?> names (not allowed);
    - var names = new ArrayList<?>(); (not allowed);
- (unbounded) => List of any type using wildcard
- (upper bound) => List of Student type or subtype of Student using wildcard
- (lower bound) => List of super type (parent/ancestor) of LPAStudent i.e. Student & Object using wildcard
  ```
   List<? super LPAStudent> => (lower bound)
   List<? extends Student> => (upper bound)
   List<?> => (unbounded)
  ```
- Wild card issues:
  ```
    public static void printMoreList(List<? extends Student> students) { 
       Student last = students.get(students.size()-1);
       students.set(0,last); => not possible since using wildcards, it could be Student or LPAStudent type but compiler dont know, so its not allowed and wont work
       for(var student: students) {
         System.out.println(student.getYearStarted() + ": " + student);
       }
      System.out.println();
    }
  ```
- Type erasure: (both the methods below will be considered same during compile time, while using generics both referred as list of objects, List<'Object'>)
  - when we have the below issue, we can use List<?> (wildcard)
    ```
    public static void testList(List<String> list) {  // => when implementing below method it errors with type erasure, to avoid such collision used bounded generics
          for(var ele: list) {
              System.out.println("String " + ele.toUpperCase());
          }
      }

      public static void testList(List<Integer> list) {
          for(var ele: list) {
              System.out.println("Integer " + ele.floatValue());
          }
      }
    ```
- Generics with <'super'>
  ```
     // Works:
     var students2021 = QueryList.getMatches(students,"yearStarted", "2021");
     printMoreList(students2021);
  
     // Do not work:
     var students2021 = QueryList.getMatches(new ArrayList<>(),"yearStarted", "2021");
     printMoreList(students2021); => this will error because students2021 variable will be of List<QueryItem> and not List<Student>
  
     // rectifying
     var students2021 = QueryList.<Student>.getMatches(new ArrayList<>(),"yearStarted", "2021");
     printMoreList(students2021);
  ```
- to use multiple upper bounds
  ```
   public class GenericClass<T extends AbstractClassA & InterfaceA & interfaceB>
  
   public class QueryList <T extends Student & Comparable & QueryItem>
  ```
    - extends used for both class and interface
    - maximum extends one class and zero to multiple interface at once
    - class first and then followed by interfaces.