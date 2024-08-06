public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDuration(3945));
        System.out.println(getDuration(65,45));
        System.out.println(getDuration(-65,-45));
        System.out.println(getDuration(55,13));
    }

    public static String getDuration (int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        } else {
            int remainingSeconds = seconds%60;
            int minutes = (seconds/60)%60;
            int hours = (seconds/60)/60;
            return hours + "h " + minutes + "m " + remainingSeconds + "s";
        }
    }

    public static String getDuration (int minutes, int seconds) {
        if ((minutes > 0 && minutes < 59) || seconds < 0) {
            int secondsTotal = seconds + (minutes * 60);
            return getDuration(secondsTotal);
        }
        return "Invalid Value";
    }
}
