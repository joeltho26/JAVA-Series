package ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] intArray = randomIntArray(10);
        reverse(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] randomIntArray (int len) {
        Random number = new Random();
        int[] intArray = new int[len];
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = number.nextInt(1,100);
        }
        return intArray;
    }

    public static int[] reverse(int[] array) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    isSorted=true;
                }
            }

            if (!isSorted) {
                break;
            }

        }
        return array;
    }
}
