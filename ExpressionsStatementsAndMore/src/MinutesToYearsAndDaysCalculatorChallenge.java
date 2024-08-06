public class MinutesToYearsAndDaysCalculatorChallenge {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes >= 0) {
            int days = (int) (minutes/60)/24;
            int year = days/365;
            int daysRemaining = days%365;
            System.out.println(minutes + "m = " + year + "y and " + daysRemaining + "d");
        } else {
            System.out.println("Invalid Value!");
        }

    }
}
