import java.io.Console;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            getUserInputFromConsole();
        } catch (NullPointerException e) {
            getUserInputFromScanner();
        }
    }

    public static void getUserInputFromConsole () {
        Console input = System.console();
        String data = input.readLine("Console");
        System.out.println("Output: " + data);
    }

    public static void getUserInputFromScanner () {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        System.out.println("Output: " + data);
    }
}
