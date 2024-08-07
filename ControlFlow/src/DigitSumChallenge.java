public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(475));
        System.out.println(sumDigitMathematical(123));
    }

    public static int sumDigits (int number) {
        String numbers = "" + number;
        int sum = 0;
        int[] nums = new int[numbers.length()];
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            sum += nums[i];
        }
        return sum;
    }

    public static int sumDigitMathematical(int number) {
        int sum = 0;
        while (true) {
            if (number < 10) {
                sum += number;
                break;
            } else {
                int remainder = number % 10;
                number = number / 10;
                sum += remainder;
            }
        }
        return sum;
    }
}
