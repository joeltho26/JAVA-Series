public class EvenDigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(evenDigitSum(123456789));
        System.out.println(evenDigitSum(252));
        System.out.println(evenDigitSum(-22));
    }

    public static int evenDigitSum (int number) {
        int sum=0;
        if (number > 0) {
            while (true) {
                if (number < 10 && (number % 2) == 0) {
                    sum += number;
                    break;
                } else {
                    int remainder = number % 10;
                    number = number / 10;
                    if ((remainder % 2) == 0) {
                        sum += remainder;
                    }
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
