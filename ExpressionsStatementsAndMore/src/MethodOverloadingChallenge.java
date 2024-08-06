public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        int feet = 5;
        int inches = 8;
        System.out.println(feet + "ft " + inches + "in = " + convertToCentimeters(feet,inches) + "cm");
    }

    public static double convertToCentimeters (int inches) {
        return inches * 2.54;

    }

    public static double convertToCentimeters (int feet, int inches) {
        if (feet >= 0 || inches >= 0) {
            int inchConversion = (feet * 12) + inches;
            return convertToCentimeters(inchConversion);
        } else {
            return -1;
        }
    }
}
