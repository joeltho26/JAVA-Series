# Constructors:
- use the same name of the class to create constructor
- constructors can be called implicitly and explicitly
------
### Implicit Constructor (default)
- They need not be created, Java creates us an implicit constructor
  ```
  class One {
    private int num;
    public One () {    => default constructor
    }
  }
  
  // Calling code
   One num = new One();
  ``` 
------
### Explicit Constructor (user defined)
- They are created by the user.
  ```
  class One {
    private int number;
    public One (int number) {
        this.number = number
    }
  }
  
  // Calling code
   One num = new One(100);
  
  OR 
  
  class One {
    private int number;
    public One (int value) { 
       number = value;
    }
  }
  
  // Calling code
   One num = new One(100);
  ``` 
-------
## Constructor Overloading:
- can overload a constructor by changing the constructor signature

  ```
  class One {
    private int number;
    private String details;
    
    public One (int value) { 
      number = value;
      details = "This is an integer";
    }
    
    public One (int number, String data) {  
      this.number = number;
      details = data;
    }
  }
  
  // Calling code
   One num = new One(100,"This is a number");
   One num2 = new One(50);
  ``` 

## Constructor Chaining:
- use of "this" keyword to invoke the main constructor with all the parameters present for the fields in a class

  ```
  class One {
    private int number;
    private String details;
    
    public One (int value) { 
       this(value,"This is a number")
    }
    
    public One (int number, String data) {  
      this.number = number;
      details = data;
    }
  }
  
  // Calling code
   One num = new One(100,"This is a number");
   One num2 = new One(50);
  ``` 

#### Note:
- Generally it's not advised to call the setter methods inside the constructors to asign the values to the fields of a class (attribute/variables)
- we can also use "super()" to access parent class constructor