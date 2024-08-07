# Data Types:
- Primitive
- Non-Primitive

## Primitive:
- They do not contain methods to manipulate data
- Whole numbers:
    - int, byte, short, long (L = used end of the value)
- Real Numbers:
    - double (D = used end of the value or not necessary), float (F = used end of the value)
  - Others:
      - char (single quotes) & boolean
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
  ```

### Primitive data types & its Memory:
- byte => 1 byte (8 bits)
- short => 2 bytes (16 bits)
- int => 4 bytes (32 bits)
- long => 8 bytes (64 bits)
- float => 4 bytes (32 bits)
- double => 8 bytes (64 bits)
- char => 2 bytes (16 bits)
- boolean => 1 bit

### Primitive data types & its WrapperClass:
- byte <=> Byte
- short <=> Short
- int <=> Integer
- long <=> Long
- float <=> Float
- double <=> Double
- char <=> Character
- boolean <=> Boolean

### Casting:
- Narrowing:
    - from large data type to smaller data type
  ```
    double data;
    int value = (int) data;
  ```
- Widening
    - from smaller data type to larger data type
  ```
    int data;
    double value = data;
  ```

#### Note:
- For precise real number calculations, use BigDecimal
- Underscore can be used between values assigned to the data types to mark the denominations
  ```
  double value = 2_47_475_641; //247475641
  ```
- To get min & max of data types, use the wrapper class:
  ```
    Integer.MAX_VALUE
    Integer.MIN_VALUE
  ```
    - The same is used for all primitive data types
- Overflow & Underflow (wraparounds):
    - Values assigned to primitive data type above max value then returns to min value called as Overflow.
    - Values assigned to primitive data type below min value then returns to max value called as Underflow.
- Double quotes are for string and single quotes are for characters
- Initializing multiple variables:
  ```
    int x,y;
    int x=10,y=20;
  ```
- We can use unicode for alphabets and symbols
  ```
    char name = '\u0044'     //D
    char name = 'D'          //D
    char name = '68'        //D
  ```
  - "symbl.cc" to get the unicode for alphabets and symbols
  
## Non-Primitive:
- They contain methods to manipulate data like length, add, remove, replace, find, indexOf, etc
- String, Arrays, etc

  ```
   Non-Primitive type variables (Wrapper Classes):
  
    String userData = "Hello World!";
    int[] numList = new int[5];
    StringBuilder stringData = new StringBuilder(30);
    ArrayList<Integer> valueList = new ArrayList<>();
  ```
  
