# Lambda Expressions:
- need functional interface types for Lambda expressions to work
- they only care about the abstract method like for comparator => compareTo()
- Functional Interface:
  - has one and only one abstract method (SAM => Single abstract method i.e. functional method)
  - target type for lambda expressions
- Many java classes use functional interfaces in their method signature, allows us to pass lambdas as arguments
- Consumer interface (java.util.function package), has only one "void accept(T t);" abstract method
  ```
  default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

  // Method references
        System.out.println("---------");
        list.forEach(System.out::println);

  // for this lambda function we dont need to return anything and () is not necessary
        System.out.println("---------");
        list.forEach((n) -> System.out.println(n));
  
        System.out.println("---------");
        list.forEach(n -> System.out.println(n));

  // for this lambda function we dont need to return anything and but () is necessary since the type is mentioned
        System.out.println("---------");
        list.forEach((String n) -> System.out.println(n));

  // also usage of var is allowed
        System.out.println("---------");
        list.forEach((var n) -> System.out.println(n));

  // for this lambda function we need to return and () is necessary since the type is mentioned
        System.out.println("---------");
        list.forEach((String n) -> {
            char firstChar = n.toUpperCase().charAt(0);
            String remainingChars = n.substring(1);
            System.out.println(firstChar+remainingChars);
        });
  ```
- variables used inside lambda should be effectively final like example below
  ```
    String prefix = "nato";
    list.forEach((String n) -> {
            char firstChar = n.toUpperCase().charAt(0);
            String remainingChars = n.substring(1);
            System.out.println(prefix + " " + firstChar+remainingChars);
        });
    prefix = "NATO"; => not allowed
  ```
- similarly lambda variables should not use same variable names that are present in the enclosing class like example below
  ```
    String n = 10; => not allowed
    list.forEach((String n) -> {
            char firstChar = n.toUpperCase().charAt(0);
            String remainingChars = n.substring(1);
            System.out.println(firstChar+remainingChars);
        });
  ```
- The main 4 categories of functional interface
  - #### Consumer => void accept(T t) => execute code without returning data
  - #### Function => R apply(T t) => return result of an operation or function
  - #### Predicate => boolean test(T t) => test a condition if true or false
  - #### Supplier => T get(T t) => return an instance
- Consumer:
  - Consumer<'T'> => void accept(T t)
  - BiConsumer<T,U> => void accept(T t, U u)
- Predicate:
  - Predicate<'T'> => boolean test(T t)
  - BiPredicate<T,U> => boolean test(T t, U u)
- Function:
  - Function<T,R> => R apply(T t) , R => result and its mentioned always last (T,R) 
  - BiFunction<T,U,R> => R apply(T t, U u)
  - UnaryOperator<'T'> => T apply(T t)
  - BinaryOperator<'T'> => T apply(T t1, T t2)
