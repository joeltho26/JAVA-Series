import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        minMax();
    }

    public static void minMax () {
        int counter=1;
        Scanner input = new Scanner(System.in);
        double max=Double.MIN_VALUE, min=Double.MAX_VALUE;
        while (true) {
            try {
                System.out.println("Enter number: #" + counter);
                double dataInput = Double.parseDouble(input.nextLine());
                if (dataInput<min) {
                    min = dataInput;
                }
                if (dataInput>max) {
                    max = dataInput;
                }
                counter++;
                System.out.println("Max Value: " + max + " & Min Value: " + min);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input!");
                break;
            }
        }

    }
}
