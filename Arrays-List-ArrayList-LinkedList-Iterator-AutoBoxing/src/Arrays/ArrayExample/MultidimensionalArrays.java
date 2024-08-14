package Arrays.ArrayExample;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Object[] multiArray = new Object[3];
        multiArray[0] = new int[] {1,2,3};
        multiArray[1] = new String[] {"Mary","Angela"};
        multiArray[2] = new StringBuilder("String builder method");

        System.out.println(Arrays.deepToString(multiArray));
    }

}
