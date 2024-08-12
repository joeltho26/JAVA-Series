package ArrayExample;

import java.util.Arrays;
import java.util.Random;

public class ArrayStaticMethods {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int findValue = Arrays.binarySearch(firstArray,71); // returns the position of element if matched else -1
        System.out.println(findValue);

        if (Arrays.binarySearch(firstArray,71)>=0) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element not Found");
        }

        int[] secondArray = Arrays.copyOf(firstArray,5); //5 => new length of the array
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = new int[5];
        Arrays.fill(thirdArray,5); //5 => value filled into the array
        System.out.println(Arrays.toString(thirdArray));

        int[] arrayOne = new int[] {1,2,3,4,5};
        int[] arrayTwo = Arrays.copyOf(arrayOne,arrayOne.length);

        if (Arrays.equals(arrayOne,arrayTwo)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }



    }

    private static int[] getRandomArray (int len) {
        Random random = new Random();
        int[] intArray = new int[len];

        for (int i=0; i<intArray.length; i++) {
            intArray[i] = random.nextInt(70,80);
        }
        return intArray;
    }
}
