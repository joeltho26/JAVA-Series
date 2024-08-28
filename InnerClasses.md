## Static Nested Class:
- static nested class is a class enclosed inside another class and declared static
- means, the class accessed externally required outerclass name as part of the qualifying class
- it can access private variable or methods in the outer class
- similarly, the enclosing class can also access private attribute inside the nested class

## Local Class:
- no access modifiers
- local classes are inner classes directly in a code block, usually a method body
- like inner class, they have access member variables both inner and encapsulated class as well
- variables are effectively final
- JDK 16, local record, local enum, local interface are also allowed with the body of the code block and static types
- once assigned a variable with value, then we cannot create a variable with same name in the local class.

## Inner Class:
- non-static classes, declared on enclosing class at member level
- can have 4 access modifiers
- have access to instance members including private variables as well

## Anonymous Class:
- does not have a name
```
  var c4 = new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
```