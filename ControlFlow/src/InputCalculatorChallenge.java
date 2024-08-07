import java.util.Scanner;

public class InputCalculatorChallenge {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner input = new Scanner(System.in);
        double sum=0;
        int counter=0;
        double average=0;
        while (true) {
            try {
                System.out.println("Enter Number: #" + counter);
                double data = Double.parseDouble(input.nextLine());
                counter++;
                sum += data;
                average=sum/counter;
            } catch (NumberFormatException e) {
                System.out.println("SUM: " + sum + " AVERAGE: " + average);
                break;
            }
        }
    }
}
