package ArrayExample;

import java.util.Arrays;

public class VariableReference {
    public static void main(String[] args) {
        int[] oneArray = new int[5];
        int[] twoArray = oneArray;
        twoArray[1] = 5;
        System.out.println(Arrays.toString(oneArray));
        System.out.println(Arrays.toString(twoArray));

    }
}
