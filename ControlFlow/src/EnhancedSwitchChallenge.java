import java.util.Scanner;

public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<data.length(); i++) {
            result.append(switch (data.charAt(i)) {
                case 'A' -> "Able";
                case 'B' -> "Baker";
                case 'C' -> "Charlie";
                case 'D' -> "Dog";
                default -> {
                    yield "Invalid option";
                }
            }).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
