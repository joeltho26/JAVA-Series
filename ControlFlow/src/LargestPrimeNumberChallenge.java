import java.util.ArrayList;

public class LargestPrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(21));
        System.out.println(getLargestPrimeFactor(217));
        System.out.println(getLargestPrimeFactor(0));
        System.out.println(getLargestPrimeFactor(45));
        System.out.println(getLargestPrimeFactor(-1));
    }

    public static int getLargestPrimeFactor(int number) {
        if (number>=2) {
            int num=0;
            for (int i=2; i<number; i++) {
                if ((number%i)==0) {
                    if (isPrimeNumber(i)) {
                        num=i;
                    }
                }
            }
            return num;
        } else {
            return -1;
        }
    }

    public static boolean isPrimeNumber (int number) {
        for (int i=2; i<number; i++) {
            if ((number%i)==0) {
                return false;
            }
        }
        return true;
    }
}
