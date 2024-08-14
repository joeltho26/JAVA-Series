package Arrays.ArrayExample;

import java.util.Arrays;
import java.util.List;

public class BasicMethods {
    public static void main(String[] args) {
        int[] intArray = new int[5]; // 5 => capacity and index starts from 0 --> 4
        intArray[4] = 50;
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = new double[10];
        doubleArray[3] = 3.5;
        System.out.println(Arrays.toString(doubleArray));

        var data = new String[5];
        data[2] = "Andy";
        System.out.println(Arrays.toString(data));
        System.out.println(data.getClass().getSimpleName());
        System.out.println(data[2].getClass().getSimpleName());

        var dataNew = new Object[5];
        dataNew[2] = "Andy";
        dataNew[3] = 3.5;
        dataNew[4] = 50;
        System.out.println(Arrays.toString(dataNew));
        System.out.println(dataNew.getClass().getSimpleName());
        System.out.println(dataNew[2].getClass().getSimpleName());
        System.out.println(dataNew[3].getClass().getSimpleName());
        System.out.println(dataNew[4].getClass().getSimpleName());

        int[] newArray = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.length);

        for (int i=0; i<newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.printf("%n");
        for (int i: newArray) {
            System.out.print(newArray[newArray.length-i] + " ");
        }
        System.out.println("\n");

        var listArray = Arrays.asList(newArray);
        var listArray2 = List.of(newArray);

        System.out.println(Arrays.toString(listArray.toArray())); // need to set up toString() method to print the elements
        System.out.println(listArray.getClass().getName());

        System.out.println("\n");

        System.out.println(Arrays.toString(listArray2.toArray())); // need to set up toString() method to print the elements
        System.out.println(listArray2.getClass().getName());

        Object variable = newArray;
        if (variable instanceof int[]) {
            System.out.println("It's an int array!");
        }


    }
}
