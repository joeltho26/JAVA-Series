# Variable Argument
- only one variable argument allowed in a method parameter
- it should be the last parameter in the method
- the below example will allow both array of string or just a string value.
  ```
    public static void print(String... value) {
    ....
    .......
    ...........
    }
  
    String.join("," , myArray); myArray => is using VarArgs
  ```