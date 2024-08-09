package FormattingStringExamples;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String string = "Hello World! ";
        String value = String.valueOf("Hello");
        int valueOne = 3;
        float valueTwo = 3.14F;
        System.out.println(string.charAt(0));
        System.out.println(string.codePointAt(0));
        System.out.println(string.codePointBefore(5));
        System.out.println(string.codePointCount(0,2));
        System.out.println(string.trim());
        System.out.println(string.compareTo("World"));
        System.out.println(string.compareToIgnoreCase("hello World"));
        System.out.println(string.concat(" Good morning!"));
        System.out.println(string.contains("World"));
        System.out.println(string.contentEquals("Hello World"));
        System.out.println(string.endsWith("World"));
        System.out.println(string.startsWith("h"));
        System.out.println(string.equals("hello"));
        System.out.println(string.equalsIgnoreCase("hello"));
        System.out.println(string.indexOf("o"));
        System.out.println(string.isEmpty());
        System.out.println(string.join(" ","Good","Morning!"));
        System.out.println(string.lastIndexOf("o"));
        System.out.println(string.isEmpty());
        System.out.println(string.length());
        System.out.println(string.substring(0,6));
        System.out.println(string.toCharArray());
        System.out.println(string.toCharArray().length);
        string.toString();
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(value);
        System.out.println(string.subSequence(0,6));
        System.out.println(Arrays.toString(string.split("[a-zA-Z0-9]",1)));
        System.out.println(string.replace("Hello","Hi"));
        System.out.println(string.replaceAll("o","y"));
        System.out.println(string.replaceFirst("o","y"));
        System.out.println(string.matches("Hello"));
        System.out.println(string.regionMatches(3,"hello",2,2));
        System.out.println(string.repeat(3));
        System.out.println(string.strip());
        System.out.println(string.isBlank());
        System.out.println(string.stripIndent());
        System.out.println(string.stripLeading());
        System.out.println(string.stripTrailing());
        System.out.println(String.format("The whole no. is %d but the float point no. is %.2f", valueOne,valueTwo));
        System.out.println("The whole no. is %d but the float point no. is %.2f\n".formatted(valueOne,valueTwo));
    }
}
