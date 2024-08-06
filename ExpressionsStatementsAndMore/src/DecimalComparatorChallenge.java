public class DecimalComparatorChallenge {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        int value1 = (int) (x * 1000);
        int value2 = (int) (y * 1000);
        if (value1 == value2) {
            return true;
        }
        return false;
    }
}
