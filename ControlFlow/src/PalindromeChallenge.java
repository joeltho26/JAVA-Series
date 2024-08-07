public class PalindromeChallenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(153));
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome (int number) {
        StringBuilder reverseValue = new StringBuilder();
        String originalValue = "" + number;
        if (number > 0) {
            while (true) {
                if (number<10) {
                    reverseValue.append(number);
                    break;
                } else {
                    int remainder = number%10;
                    number = number/10;
                    reverseValue.append(remainder);
                }
            }
            if (reverseValue.toString().equals(originalValue)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
