# Convenience Methods:
- deals with lambda chaining
- Predicate, Consumer, Function, Supplier  
  ```
  String name = "tim";
  Function<String,String> fullName = s -> s.concat(" Martin");
  Function<String,String> uFullName = uCase.andThen(fullName);
  System.out.println(uFullName.apply(name));
  
  //Output => TIM Martin
  
  fullName = uCase.compose(fullName);
  System.out.println(fullName.apply(name));
  
  //Output => TIM MARTIN
  
   Function<String,String[]> f0 = uCase
                .andThen(s -> s.concat(" Doe"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));
  ```
- Convenience types:
  - Function:
    - function1.addThen(function2) => not in DoubleFunction, IntFunction & LongFunction
    - function2.compose(function1) => Only in Function & Unary Operator
  - Consumer:
    - consumer1.addThen(consumer2)
  - Predicate:
    - predicate1.add(predicate2)
    - predicate1.or(predicate2)
    - predicate1.negate()
  - Comparator (helper methods):
    - comparing(Function keyExtractor) => static
    - thenComparing(Comparator other) => default
    - thenComparing(Function keyExtractor) => default
    - reversed()