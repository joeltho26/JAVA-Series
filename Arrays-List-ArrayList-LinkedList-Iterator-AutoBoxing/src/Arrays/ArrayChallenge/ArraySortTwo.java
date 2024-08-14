package ArrayChallenge;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySortTwo {
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
            sortIntegers(array);
            printIntegers(array);
            System.out.println("\n");
            System.out.print("-".repeat(25));
            System.out.println("\n");
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

    @Contract("_ -> param1")
    public static int @NotNull [] sortIntegers(int @NotNull [] array) {
        boolean isSorted = true;
        if (array.length <= 1) {
            System.out.println("Insufficient values to perform sort");
        } else {
            while (isSorted) {
                isSorted = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        int tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        isSorted = true;
                    }
                }

                if (!isSorted) {
                    break;
                }

            }
        }
        return array;
    }

    public static void printIntegers(int @NotNull [] array) {
        if (array.length <=1) {
            System.out.printf("The only number is " + array[0] + "%n");
        } else {
            System.out.print("The numbers sorted in descending order are ");
            for (int i : array) {
                System.out.printf("%d ",i);
            }
        }
    }
}
