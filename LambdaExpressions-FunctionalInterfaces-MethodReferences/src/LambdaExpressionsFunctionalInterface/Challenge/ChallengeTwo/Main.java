package LambdaExpressionsFunctionalInterface.Challenge.ChallengeTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Ann","Mary","Julie","Rebecca","Catherine","David","Moses"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedArray = Arrays.asList(names);
        backedArray.replaceAll(s -> s += getRandomCharacter('A','E') + ".");
        System.out.println(Arrays.toString(names));

        backedArray.replaceAll(s -> s += " " + getReversed(s.split(" ")[0]));
        Arrays.asList(names).forEach(System.out::println);

        List<String> backedArrayOne = new ArrayList<>(Arrays.asList(names));
        backedArrayOne.replaceAll(s -> s += getRandomCharacter('A','E') + ".");
        System.out.println(Arrays.toString(names));
        System.out.println(backedArrayOne);
    }

    public static char getRandomCharacter(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    private static String getReversed(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}
