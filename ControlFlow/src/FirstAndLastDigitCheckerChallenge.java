public class FirstAndLastDigitCheckerChallenge {
    public static void main(String[] args) {
        System.out.println(lastDigitChecker(41, 22, 71));
        System.out.println(lastDigitChecker(23, 32, 42));
        System.out.println(lastDigitChecker(9, 99, 999));
        System.out.println("-----------------");
        System.out.println(firstDigitChecker(21, 22, 71));
        System.out.println(firstDigitChecker(23, 32, 42));
        System.out.println(firstDigitChecker(9, 99, 999));
    }

    public static boolean firstDigitChecker (int x, int y, int z) {
        if ((x>=10 && x<=1000) && (y>=10 && y<=1000) && (z>=10 && z<=1000)) {
            int xFirstDigit = firstDigit(x);
            int yFirstDigit = firstDigit(y);
            int zFirstDigit = firstDigit(z);
            return ((xFirstDigit == yFirstDigit) || (zFirstDigit == yFirstDigit) ||
                    (xFirstDigit == zFirstDigit));
        } else {
            return false;
        }

    }

    public static boolean lastDigitChecker (int x, int y, int z) {
        if ((x>=10 && x<=1000) && (y>=10 && y<=1000) && (z>=10 && z<=1000)) {
            int xLastDigit = lastDigit(x);
            int yLastDigit = lastDigit(y);
            int zLastDigit = lastDigit(z);
            return ((xLastDigit == yLastDigit) || (zLastDigit == yLastDigit) ||
                    (xLastDigit == zLastDigit));
        } else {
            return false;
        }

    }

    public static int firstDigit (int number) {
        while (true) {
            if (number<10) {
                break;
            } else {
                number = number/10;
            }
        }
        return number;
    }

    public static int lastDigit (int number) {
        if (number<10) {
            return number;
        } else {
            return number%10;
        }
    }
}
