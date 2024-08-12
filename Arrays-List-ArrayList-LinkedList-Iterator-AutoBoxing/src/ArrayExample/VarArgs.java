package ArrayExample;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        String value = "Hello World";
        print(value);

        String[] value1 = "Hello World".split(" ");
        print(value1);
    }

    public static void print(String... value) {
        if (value instanceof String[]) {
            System.out.println(Arrays.toString(value));
        } else {
            System.out.println(value);
        }
    }
}
