import java.util.Arrays;
import java.util.Scanner;

public class MethodsChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        String[] scores = data.split(",");

        String[] names = {"John","Tim","Mary","Robert","Mike"};
        int[] playerScoresList = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            playerScoresList[i] = Integer.parseInt(scores[i].trim());
        }

        for (int i=0;i<playerScoresList.length;i++) {
            int playerPosition = calculateHighScorePosition(playerScoresList[i]);
            displayHighScorePosition(names[i], playerPosition);
        }
    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName +
                " managed to get into position " +
                playerPosition +
                " on the high score list");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore>=500) {
            return 2;
        } else if (playerScore>=100) {
            return 3;
        } else {
            return 4;
        }
    }
}
