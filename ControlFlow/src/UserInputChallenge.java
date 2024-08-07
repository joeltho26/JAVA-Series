import java.io.Console;
import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        intUserInput();
        doubleUserInput();
        userInput();
    }

    public static void intUserInput () {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int counter = 0;
        while (counter<5) {
            System.out.println("Enter number #" + counter + ":");
            var data = input.nextLine();
            try {
                int number = Integer.parseInt(data);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
            System.out.println("Sum: " + sum);
        }
        System.out.println("Total sum: " + sum);
    }

    public static void doubleUserInput () {
        Scanner input = new Scanner(System.in);
        double sum=0;
        int counter = 0;
        while (counter<5) {
            System.out.println("Enter number #" + counter + ":");
            var data = input.nextLine();
            try {
                var number = Double.parseDouble(data);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
            System.out.println("Sum: " + sum);
        }
        System.out.println("Total sum: " + sum);
    }

    public static void userInput () {
        Scanner input = new Scanner(System.in);
        int counter=0;
        double sum=0;
        do {
            System.out.println("Enter number #" + counter + ":");
            try {
                double num = Double.parseDouble(input.nextLine());
                sum += num;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
            System.out.println("Sum: " + sum);
        } while (counter<5);
        System.out.println("Total sum: " + sum);
    }
}
