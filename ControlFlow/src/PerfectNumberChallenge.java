import java.util.ArrayList;

public class PerfectNumberChallenge {
    public static void main(String[] args) {
        System.out.println(isPerfectNumbers(6));
        System.out.println("-------");
        System.out.println(isPerfectNumbers(28));
        System.out.println("-------");
        System.out.println(isPerfectNumbers(5));
        System.out.println("-------");
        System.out.println(isPerfectNumbers(-1));
    }

    public static boolean isPerfectNumbers (int number) {
        if (number>1) {
            StringBuilder values = new StringBuilder();
            int sum=0;
            for (int i=1; i<number; i++) {
                if ((number%i) == 0) {
                    sum += i;
                    values.append(i).append(",");
                }
            }
            System.out.println(values.substring(0,values.length()-1));
            System.out.println("Sum of number above: " + sum);
            return number == sum;
        } else {
            System.out.println("Invalid Value!");
            return false;
        }
    }
}
