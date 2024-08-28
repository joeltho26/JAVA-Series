# Variable Argument
- it should be the last parameter in the method
- the below example will allow both array of string or just a string value.
- they also used with generics
  ```
    public static void printValue(String... value) {
      System.out.println("The value is " + value)
    }
  
   public static void printDetails(T... details) {
      System.out.println("The details are " + details.info())
    }
  
    String.join("," , myArray); myArray => is using VarArgs
  ```