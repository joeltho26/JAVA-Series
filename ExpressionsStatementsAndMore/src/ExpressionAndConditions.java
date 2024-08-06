//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExpressionAndConditions {
    public static void main(String[] args) {
       boolean gameOver = true;
       int score = 10000;
       int levelCompleted = 8;
       int bonus = 200;
       int finalScore = score;
       if (gameOver) {
           finalScore += levelCompleted * bonus;
           System.out.println(finalScore);
       }
// creating new variables
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;
        int newFinalScore = newScore;
        if (gameOver) {
            newFinalScore += newLevelCompleted * newBonus;
            System.out.println(newFinalScore);
        }
// Overiding the variables with new values
        score = 800;
        levelCompleted = 5;
        bonus = 400;
        finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println(finalScore);
        }
        finalScore = calculateScore(true,500,8,300);
        System.out.println(finalScore);
    }

    public static int calculateScore (boolean game, int score, int levelCompleted, int bonus) {
        return score + (levelCompleted * bonus);
        }
}