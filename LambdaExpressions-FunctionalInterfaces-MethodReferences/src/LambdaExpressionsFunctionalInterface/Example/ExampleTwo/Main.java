package LambdaExpressionsFunctionalInterface.Example.ExampleTwo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));
        for(String s: list) {
            System.out.println(s);
        }

        //action
        System.out.println("---------");
        list.forEach(System.out::println);

        System.out.println("---------");
        list.forEach((n) -> System.out.println(n));

        System.out.println("---------");
        list.forEach((String n) -> System.out.println(n));

        System.out.println("---------");
        list.forEach((var n) -> System.out.println(n));

        System.out.println("---------");
        list.forEach((String n) -> {
            char firstChar = n.toUpperCase().charAt(0);
            String remainingChars = n.substring(1);
            System.out.println(firstChar+remainingChars);
        });

        //Function
        int result = calculator((a,b) -> a + b,5,2);
        var resultVar = calculator((a,b) -> a / b,10.0,2.0);
        int resultInteger = calculator((Integer a, Integer b) -> a + b,5,2);
        int resultIntegerReferenceMethod = calculator(Integer::sum,5,2);
        String resultString = calculator((a,b) -> a + b,"Hello","World");
        String resultStringModified = calculator((a,b) -> {
            var data1 = a.toUpperCase().charAt(0) + a.substring((1));
            var data2 = b.toUpperCase().charAt(0);
            return data1 + " " + data2; }
                ,"John","Doe");

        int resultBinary = calculatorBinary((a,b) -> a + b,5,2);
        var resultVarBinary = calculatorBinary((a,b) -> a / b,10.0,2.0);
        int resultIntegerBinary = calculatorBinary((Integer a, Integer b) -> a + b,5,2);
        int resultIntegerReferenceMethodBinary = calculatorBinary(Integer::sum,5,2);
        String resultStringBinary = calculatorBinary((a,b) -> a + b,"Hello","World");
        String resultStringModifiedBinary = calculatorBinary((a,b) -> {
                    var data1 = a.toUpperCase().charAt(0) + a.substring((1));
                    var data2 = b.toUpperCase().charAt(0);
                    return data1 + " " + data2; }
                ,"John","Doe");

        //Unary Operator:
        list.replaceAll(s -> s.toUpperCase().charAt(0) + " - " + s.toLowerCase());
        list.forEach(System.out::println);

        String[] emptyStrings = new String[10];
        Arrays.fill(emptyStrings,"");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings,i-> "" + (i+1) + ".");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings,i-> "" + (i+1) + "." +
                switch (i) {
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            default -> "";
                });
        System.out.println(Arrays.toString(emptyStrings));

        // Consumer
        var coords = Arrays.asList(
                new double [] {47.2160,-95.2348},
                new double [] {29.1490,-85.1269},
                new double [] {33.8120,-105.1358},
                new double [] {37.6260,-95.2731}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        BiConsumer<Double,Double> p1 = (lat,lon) -> {
            System.out.printf("lat: %.3f, lon: %.3f%n", lat, lon);
        };

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);

        coords.forEach((n) -> processPoint(n[0],n[1],p1));

        coords.forEach((n) -> processPoint(n[0],n[1],(lat,lon) -> {
            System.out.printf("lat: %.3f, lon: %.3f%n", lat, lon);
        }));

        //Predicate
        // removeIf true cases is excluded and false is received
        list.removeIf((s) -> s.equalsIgnoreCase("charlie"));
        list.forEach(System.out::println);

        list.removeIf((s) -> {
            String compare = String.valueOf(s.charAt(0));
            return compare.equalsIgnoreCase("B");
        });
        list.forEach(System.out::println);

        //Supplier
        String[] names = {"Ann","Mary","Julie","Rebecca","Catherine","David","Moses"};
        String[] randomList = randomSelectedValue(15,names, () -> new Random().nextInt(0,names.length));
        System.out.println(Arrays.toString(randomList));
    }

    public static <T> T calculator(@NotNull Operation<T> function, T value1, T value2) {
        T result = function.operate(value1,value2);
        System.out.println(result);
        return result;
    }

    public static <T> T calculatorBinary(@NotNull BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1,value2);
        System.out.println(result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, @NotNull BiConsumer<T,T> consumer) {
        consumer.accept(t1,t2);
    }

    public static String @NotNull [] randomSelectedValue(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for(int i=0; i<count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

}
