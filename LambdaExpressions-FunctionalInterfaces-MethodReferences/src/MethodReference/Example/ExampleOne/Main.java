package MethodReference.Example.ExampleOne;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

class PlainOld {
    private static int last_ID = 1;
    private int id;
    public PlainOld() {
        this.id = PlainOld.last_ID++;
        System.out.println("Creating a PlainOld object " + id);
    }

    public int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Anna","Bob","Chuck","Dave"));
        list.forEach(System.out::println);

        int result = calculator( (a,b) -> a+b, 5,6);
        System.out.println(result);

        double resultBinary = calculatorBinary(7.0,6.0, (a,b) -> a/b);
        System.out.println(resultBinary);

        String resultBinaryText = calculatorBinary("Hello"," World", (a,b) -> a + b);
        System.out.println(resultBinaryText);

        String resultBinaryText1 = calculatorBinary("Hello"," World", (a,b) -> a.concat(b));
        System.out.println(resultBinaryText1);

        String resultBinaryText2 = calculatorBinary("Hello"," World",  String::concat);
        System.out.println(resultBinaryText2);

        BinaryOperator<String> data = String::concat;
        System.out.println(calculatorBinary("One ", "two", data));

        BinaryOperator<String> data1 = String::concat;
        System.out.println(data1.apply("One ", "two"));

        BiFunction<String,String,String> data2 = String::concat;
        System.out.println(data2.apply("One ", "two"));
        System.out.println(calculatorBiFunction(data2, "One ", "two"));

        UnaryOperator<String> data3 = String::toUpperCase;
        System.out.println(data3.apply("one"));

        System.out.println(Optional.of("Hello".transform(String::toUpperCase)));

        String valueText = "Hello".transform(String::toUpperCase);
        System.out.println(valueText);

        Function<String,Boolean> resultBoolean = String::isEmpty;
        Boolean resultBooleanAnother = valueText.transform(resultBoolean);
        System.out.println(resultBooleanAnother);

        System.out.println(resultBoolean.apply(""));

        Supplier<PlainOld> reference1 = PlainOld::new; // instead of => new PlainOld();
        System.out.println(reference1.get().getId());
        System.out.println("-".repeat(10));

        PlainOld referenceObj = reference1.get();
        System.out.println("-".repeat(10));

        PlainOld[] pojo1 = seedArray(reference1,3);
        Arrays.asList(pojo1).forEach(s -> {
            int value = s.getId();
            System.out.printf(value + " ");
        });

        PlainOld[] pojo2 = seedArray(PlainOld::new,3);

    }

    private static <T> T calculatorBiFunction(BiFunction<T, T, T> function, T t1, T t2) {
        return function.apply(t1,t2);
    }

    public static <T> T calculator(@NotNull Operation<T> function, T t1, T t2) {
        return function.operate(t1,t2);
    }

    public static <T> T calculatorBinary(T t1, T t2, BinaryOperator<T> function) {
        return function.apply(t1,t2);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }

}
