package ArrayChallenge;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) throws InputMismatchException {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please provide the length of the array or array size");
            int arraySize;
            try {
                arraySize = input.nextInt();
                if (arraySize<=0) {
                    System.out.println("Invalid value for the length of an array");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("User input mismatch!");
                e.printStackTrace();
                continue;
            }
            int[] array = getIntegers(arraySize);
            System.out.println(Arrays.toString(reverse(array)));
            System.out.println("\n");
            System.out.println("-".repeat(25));
        }
    }

    public static int @NotNull [] getIntegers(int arraySize) throws NumberFormatException {
        while(true) {
            Scanner inputNumbers = new Scanner(System.in);
            int[] intArray = new int[arraySize];
            String[] numbers;
            System.out.println("Please enter " + arraySize + " number for the array list");
            try {
                numbers = inputNumbers.nextLine().split(",");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input value!");
                e.printStackTrace();
                continue;
            }

            if (numbers.length == arraySize) {
                for (int i = 0; i < numbers.length; i++) {
                    intArray[i] = Integer.parseInt(numbers[i]);
                }
            } else {
                System.out.println("User input numbers either exceed or deficit of the array size specified");
                continue;
            }
            return intArray;
        }
    }

    public static int @NotNull [] reverse (int @NotNull [] array) {
        int[] reverseArray = new int[array.length];
        for (int i=0; i<reverseArray.length; i++) {
            reverseArray[i] = array[reverseArray.length-1-i];
        }
        return reverseArray;
    }
}
