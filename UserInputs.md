# User Inputs:
### - System.console():
  ``` 
    Console input = System.console();
    input.readLine("Please enter the input....");
   
    Console input = System.console();
    input.readLine(); 
   ```
#### Note:
- Most IDE do not support this and result Null pointer Exception
- However, it is supported via terminal execution.
------
### - System.in:
#### Note: 
- not commonly used and difficult to implement
------
### - Scanner class:
```
  Scanner input = new Scanner("Hello!");
  input.nextLine();

  Scanner input = new Scanner(System.in);
  input.nextLine(); 
  
  Other option: input.nextInt(), input.nextDouble(), etc,.
  
 ```
------