# User Exception:
- User-defined Exception
- Built-in Exception

## Built-in Exception:
- ArithmeticException
- ArrayIndexOutOfBoundsException
- ClassNotFoundException
- FileNotFoundException
- IOException
  - Types of Java IOException:
    - FileNotFoundException
    - SocketException
    - EOFException
    - InterruptedIOException
    - FileLoadException
  - eg: 
    - Scanner scan = new Scanner("Please enter numbers...");
    - scan.ioException();
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
  - eg: throw new IllegalArgumentException("Not Eligible for Voting");
- IllegalStateException
  - This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.
  - eg: throw new IllegalStateException("Either one or two numbers are not Positive Integer");

### Checked vs UnChecked Exceptions:
- Checked Exceptions:

- Unchecked Exception:

## Throw vs Throws:
- Throw:
  - Explicitly want to throw an exception.
  - throw keyword is followed by object of exception class
    - eg: throw new ArthimeticException("Invalid Number");
  - Used inside the class/method
  - Only one Exception allowed
- Throws: 
  - Specify exceptions to be thrown from a method/class
  - throws keyword is followed by the class name.
    - eg: 
      - public MyClass extends BaseClass throws IOException, FileNotFoundException {}
      - public static void printDetails() throws NumberFormatException,StringIndexOutOfBoundsException {}
  - Used along with method signature
  - multiple Exceptions allowed