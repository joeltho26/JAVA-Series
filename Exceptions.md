# User Exception:
- User-defined Exception
- Built-in Exception

## Built-in Exception:
- ArithmeticException
- ArrayIndexOutOfBoundsException
- ClassNotFoundException
- FileNotFoundException
  - It is a subclass of IOException
- IOException
  - Types of Java IOException:
    - FileNotFoundException
    - SocketException
    - EOFException
    - InterruptedIOException
    - FileLoadException
  ``` 
    Scanner scan = new Scanner("Please enter numbers...");
    scan.ioException();
  ```
- InterruptedException
  - It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.
- NoSuchFieldException
  - It is thrown when a class does not contain the field (or variable) specified
- NoSuchMethodException
- NullPointerException
- NumberFormatException
- RuntimeException
- StringIndexOutOfBoundsException
- IllegalArgumentException
  - This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception.
  ```
  throw new IllegalArgumentException("Not Eligible for Voting");
  ```
- IllegalStateException
  - This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.
  ```
  throw new IllegalStateException("Either one or two numbers are not Positive Integer");
  ```

## User-defined Exception:
- The following steps are followed for the creation of a user-defined Exception.
- The user should create an exception class as a subclass of the Exception class. Since all the exceptions are subclasses of the Exception class, the user should also make his class a subclass of it. 
  ```
  class MyException extends Exception
  ```
- We can write a default constructor in his own exception class.
  ```
  MyException() {
  }
  ```
- We can also create a parameterized constructor with a string as a parameter.
- We can use this to store exception details. We can call the superclass(Exception) constructor from this and send the string there.
   ``` 
  MyException(String str)
    {
    super(str);
    } 
  ```
  - To raise an exception of a user-defined type, we need to create an object to his exception class and throw it using the throw clause, as:
  ``` 
    MyException me = new MyException(“Exception details”);
    throw me;
  ```

Object -> Throwable
1. Exceptions
   - Checked
   - Unchecked
2. Errors
   - Virtual Machine Error
   - Assertion Error

## Checked vs UnChecked Exceptions:
### Checked Exceptions:
  - These are the exceptions that are checked at compile time
  - Checked exceptions represent invalid conditions in areas outside the immediate control of the program (like memory, network, file system, etc.)
  - Any checked exception is a subclass of Exception. 
  - Checked exceptions must be either caught by the caller or listed as part of the method signature using the throws keyword.
  - #### Fully Checked Exception:
    - A fully checked exception where all its child classes are also checked (e.g., IOException, InterruptedException).
  - #### Partially Checked Exception:
    - A partially checked exception where some of its child classes are unchecked (e.g., Exception).

### Unchecked Exception:
  - These are the exceptions that are not checked at compile time
  - No exception during compile-time but result exception during run-time.
  - In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked
  - Unchecked exceptions include all subclasses of the RuntimeException class, as well as the Error class and its subclasses.
  - eg: ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException, etc

## Throw vs Throws:
### Throw:
  - Explicitly want to throw an exception.
  - throw keyword is followed by object of exception class
  ```
    throw new ArthimeticException("Invalid Number");
  ```
  - Used inside the class/method
  - Only one Exception allowed

### Throws: 
  - Specify exceptions to be thrown from a method/class
  - throws keyword is followed by the class name.
  ```
  public MyClass extends BaseClass 
    throws IOException, FileNotFoundException {
    }
    
  public static void printDetails() 
    throws NumberFormatException,
    StringIndexOutOfBoundsException {
    }
  ```
  - Used along with method signature
  - multiple Exceptions allowed