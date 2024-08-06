public class CheckNumberChallenge {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-30);
        checkNumber(0);
    }
    public static void checkNumber (int number) {
        if (number < 0) {
            System.out.println("Negative");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
    }
}
