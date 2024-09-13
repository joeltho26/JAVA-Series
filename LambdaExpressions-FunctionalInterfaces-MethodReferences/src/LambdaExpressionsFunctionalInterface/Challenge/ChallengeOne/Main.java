package LambdaExpressionsFunctionalInterface.Challenge.ChallengeOne;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };
        printWords.accept("Let's split this up into an array");
        printWordLambda.accept("Let's split this up into an array");

        Consumer<String> printWordForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };
        printWordForEach.accept("Let's split this up into an array");

        Consumer<String> printWordConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(n -> System.out.println(n));
        };
        printWordConcise.accept("Let's split this up into an arrays");

        Function<String,String> printString = sentence -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<sentence.length(); i++) {
                returnVal.append(sentence.charAt(i)).append(" ");
            }
            return returnVal.toString();
        };

        String value = printString.apply("Watermelon");
        System.out.println(value);

        UnaryOperator<String> printStringUnary = sentence -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<sentence.length(); i++) {
                returnVal.append(sentence.charAt(i)).append(" ");
            }
            return returnVal.toString();
        };

        String value1 = printStringUnary.apply("Watermelon");
        System.out.println(value1);

        Function<String, List<String>> printStringFunc1 = sentence -> {
            return List.of(sentence.replace("", " "));
        };

        List<String> value2 = printStringFunc1.apply("Watermelon");
        System.out.println(value2);

        System.out.println(everySecondCharacter(printString,"Watermelon"));

        Supplier<String> iLoveJava = () -> "I Love Java";
        System.out.println(iLoveJava.get());

        System.out.println(everySecondChar("I Love Java"));
    }

    public static @NotNull String everySecondChar(@NotNull String source) {
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<source.length(); i++) {
            returnVal.append(source.charAt(i));
        }
        return returnVal.toString();
    }

    public static @NotNull String everySecondCharacter(Function<String,String> func, @NotNull String source) {
        return func.apply(source);
    }

}
