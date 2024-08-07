public class Sample {
    static int num = 10;
    public int value = 10;

    public static void printNum () {
        System.out.println(num);
        //System.out.println(value);    // NOT ALLOWED
     }

    public void printNumber () {
        System.out.println(num);
        System.out.println(value);
    }

    public static void main(String[] args) {
        printNum();
        Sample sample = new Sample();
        sample.printNumber();
        sample.printNum();
    }
}
