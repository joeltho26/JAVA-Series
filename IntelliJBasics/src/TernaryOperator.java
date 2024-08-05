import java.io.Console;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

// To compile the input statement we need terminal to run.
// IDE's won't allow "System.console()" to run

        // Console input = System.console();
        //int age = Integer.parseInt(input.readLine());

        String isAdult = age > 18 ? "Adult":"Minor";
        System.out.println(isAdult);
    }
}
