import java.util.Scanner;

public class NumberInWordChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        printNumberInWord(data);
    }

    public static void printNumberInWord (int number) {
        String numberToString = "" + number;
        int[] numberList = new int[numberToString.length()];
        int counter = numberToString.length()-1;
        int remainder;
        while (true) {
            if (number<10) {
                numberList[counter] = number;
                break;
            } else {
                remainder = number%10;
                number = number/10;
                numberList[counter] = remainder;
                counter--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i=0; i<numberList.length; i++) {
            result.append(switch (numberList[i]) {
                case 0 -> "ZERO";
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> {
                    yield "Invalid option";
                }
            }).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
