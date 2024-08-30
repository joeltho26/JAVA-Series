package MethodReference.Challenge.ChallengeOne;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person (String name) {
        public static @NotNull String last(@NotNull String s) {
            return s.substring(0,s.length()-2);
        }

        public @NotNull String fullname(@NotNull String s) {
            return name + " " + s.substring(0, s.indexOf(" "));
        }

    }
    public static void main(String[] args) {
        String[] names = {"Ann","Mary","Julie","Rebecca","Catherine","David","Moses"};
        Person tim = new Person("TIM");
        List<UnaryOperator<String>> functions = new ArrayList<>(List.of(
                String::toUpperCase,
                String::toLowerCase,
                s -> s += " " + getRandomChar('A','Z') + ".",
                s -> s += " " + reverse(s,0,1),
                Main::reverse,
                String::new,
                s -> new String(String.valueOf(s.charAt(0)).matches("[amAM]+")? String.valueOf(s.toUpperCase().charAt(0)).concat(s.substring(1)): s),
                String::valueOf,
                Main.Person::last,
                tim::fullname,
                (new Person("Mary"))::fullname
                ));

        applyChanges(names,functions);
    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions) {
        List<String> backedArray = Arrays.asList(names);
        for(var function: stringFunctions) {
            backedArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char start, char end) {
        return (char) random.nextInt((int) start,(int) end+1);
    }

    private static String reverse(String value, int start, int end) {
        return new StringBuilder(value.substring(start,end)).reverse().toString();
    }

    private static String reverse(String value) {
        return reverse(value, 0, value.length());
    }

}
