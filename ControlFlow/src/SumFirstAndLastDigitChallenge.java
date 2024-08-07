public class SumFirstAndLastDigitChallenge {
    public static void main(String[] args) {
        System.out.println(sumFirstLastDigit(123));
        System.out.println(sumFirstLastDigit(9));
        System.out.println(sumFirstLastDigit(12));
    }

    public static int sumFirstLastDigit (int number) {
        int counter = 0;
        int sum = 0;
        while (true) {
            if (number < 10) {
                sum += number;
                break;
            } else if (counter == 0) {
                int remainder = number%10;
                sum += remainder;
                counter++;
            } else {
                number = number/10;
            }
        }
        return sum;
    }
}
