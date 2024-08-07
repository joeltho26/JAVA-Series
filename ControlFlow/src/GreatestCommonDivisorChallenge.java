public class GreatestCommonDivisorChallenge {
    public static void main(String[] args) {
        System.out.println(gcdDivisor(25,15));
        System.out.println(gcdDivisor(12,30));
        System.out.println(gcdDivisor(9,18));
        System.out.println(gcdDivisor(81,153));
    }

    public static int gcdDivisor (int x, int y) {
        if (x>=10 && y>=10) {
            while (y!=0) {
                int remainder = x%y;
                x=y;
                y=remainder;
            }
            return x;
        } else {
            return -1;
        }

    }
}
