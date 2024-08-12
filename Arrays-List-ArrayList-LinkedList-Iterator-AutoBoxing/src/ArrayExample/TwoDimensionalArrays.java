package ArrayExample;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] newArray = new int[5][3];
        newArray[2] = new int[] {1,2,3};
        newArray[3] = new int[] {1,2,3};
        newArray[4] = new int[] {1,2,3};
        System.out.println(Arrays.deepToString(newArray));

        int[][] newArray2 = new int[][] {
                {1,2,3},
                {1,2,3}
        };
        System.out.println(Arrays.deepToString(newArray2));

        int[] newArray3 [] = new int[5][3];
        newArray3[2] = new int[] {1,2,3};
        newArray3[3] = new int[] {1,2,3};
        System.out.println(Arrays.deepToString(newArray3));
        System.out.printf("-".repeat(20) + "%n");
        for (int[] i: newArray3) {
            System.out.println(Arrays.toString(i));
        }
        System.out.printf("-".repeat(20) + "%n");
        for (int i=0; i<newArray3.length; i++) {
            for (int j=0; j<newArray3[i].length; j++) {
                System.out.print(newArray3[i][j] + " ");
            }
            System.out.printf("%n");
        }
    }
}
