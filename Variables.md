# Variables:
- follow camel-case while naming
- variables can be created with primitive and non-primitive data types
  ```
  Primitve type variables:
  
   int value = 5;
   float pi = 3.14F;
   long stars = 648950012L;
   double stars = 243525D;
   byte num = 12;
   short digits = 10;
   boolean isAdult = true;
   char alphabet = 'A';
  
  Non-Primitive type variables (Wrapper Classes):
  
   String userData = "Hello World!";
   int[] numList = new int[5];
   ArrayList<Integer> valueList = new ArrayList<>();
  ```
-----
## Access & Non-Access Modifiers
- #### Access Modifiers:
  - ##### private:
    - variables used within the same class
    - variables still can be accessed outside the class via encapsulation getter and setter methods
  ```
  FILE 1:
  
    public class One {
      private int num = 10;

      public int getNum () {
        return this.num;
      }

      public void setNum (int num) {
        this.num=num;
      }
    }
  ``` 

  ```
  FILE 2:
  
    public class Two {
      public static void main(String[] args) {
        One classOne = new One();
        System.out.println(classOne.getNum());
      }
    }
  
  OR
  
    public class Two extends One {
      public static void main(String[] args) {
        Two classTwo = new Two();
        System.out.println(classTwo.getNum());
      }
    }
  ``` 
  - ##### protected:
    - variables used within the same package and subclasses
  - ##### public:
    - variable is accessible in every classes inheriting it. 
  - ##### default (no access modifier mentioned):
    - variable is only accessible in the same package
-----
- #### Non-Access Modifiers:
  - ##### final
    - variable values cannot be modified
  - ##### static
    - used on variables when a static method accesses it.
    - any changes on the static variable will cause change everywhere the static variable is accessed
  ```
    public class Sample {
      static int num = 10;
      public int value = 10;

      static void printNum () {
         System.out.println(num);
         System.out.println(value);    // NOT ALLOWED
      }

      public void printNumber () {
         System.out.println(num);
         System.out.println(value);
      }

      public static void main(String[] args) {
         printNum();
         Sample sample = new Sample();
         sample.printNumber();
     }
   }
  ```
  - ##### transient:
    - variables are skipped when serializing the object containing them
    
  - ##### volatile:
    - variables are not cached thread-locally, and is always read from the "main memory"
-----