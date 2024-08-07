## Methods:
- Arguments (values passed to the methods)
- parameters (used at the method declaration)

### Note:
- Method signature consist of both the method name and the uniqueness of the declaration of its parameters (data types, number of parameters & order)
-----
### Method overloading:
- Using same method name but different signature
- Compile-time polymorphism
  ```
  public void printDetails (int x)
  public void printDetails (int x, int y)
  public void printDetails (double x)
  ```
-----
### Method overriding:
- while using inheritance, same method in the child class is overrides the parents class method and its operations if necessary with the same name
- Run-time polymorphism
-----
## Method Modifiers:
- #### Access Modifiers:
  - ##### public:
    - methods with public keywords are accessed by externally
    - need to create instance of a class to access the method
  ```
  public boolean isPrimeNumber(int number) {
   }
  ```
  - ##### private:
    - The method is only accessible within the declared class
  ```
  private boolean isPrimeNumber(int number) {
   }
  ```
    - But still the private methods can be accessed outside the class via Reflection API
  ```
  import Java.lang.reflect.Method; 
  
  class FirstClass {
    private void private_Method() { 
      System.out.println("Private Method "
        + "called from outside"); 
    } 

    public void printData() { 
      System.out.println("Public Method"); 
    } 
  }
  
  
    class SecondClass { 
      public static void main(String[] args) 
        throws Exception { 
          Check c = new Check();
          Method m = Check.class.
                    getDeclaredMethod("private_Method");
          m.setAccessible(true);
          m.invoke(c); 
      } 
  }
    ```
    - ##### protected:
      - The code is accessible in the same package and subclasses via inheritance
  ```
  protected printDetails() {
   }
  ```
    - ##### default:
      - The method is only accessible in the same package
-----
- #### Non-Access Modifiers:
  - ##### Static Methods:
    - they are called directly and not via instances
  ```
      class First {
         static void printDetails () {
            System.out.println("Details...");
         }
  
         public static void main (string[] args) {
            printDetails();
         }
      }
  ```
  - ##### Non-Static Methods:
    - they are called via instances (by creating objects of a class)
  ```
      class First {
         public void printDetails () {
            System.out.println("Details...");
         }
  
         public static void main (string[] args) {
            First details = new First();
            details.printDetails();
         }
      }
  ```
  
  - ##### Both (Static & Non-Static):
    - they are called directly and not via instances
    - they are called via instances (by creating objects of a class)
  ```
      class First {
         public static void printDetails () {
            System.out.println("Details...");
         }
  
         public static void main (string[] args) {
            First details = new First();
            details.printDetails();
            printDetails();
         }
      }
  ```
  - ##### final:
    - methods cannot be modified or overridden.
    
  - ##### abstract:
    - can only be used in an abstract class
    - abstract methods have no body and the body is defined in subclass via inheritance
  
  - ##### transient:
    - methods are skipped when serializing the object containing them
  
  - ##### synchronized:
    - methods can only be accessed by one thread at a time