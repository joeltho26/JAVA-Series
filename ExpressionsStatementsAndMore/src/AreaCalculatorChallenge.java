public class AreaCalculatorChallenge {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static double area (double length, double breadth) {
        if (length < 0 || breadth < 0) {
            return -1;
        } else {
            return length * breadth;
        }
    }
}
