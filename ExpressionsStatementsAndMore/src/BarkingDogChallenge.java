public class BarkingDogChallenge {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(false, 2));
    }

    public static boolean shouldWakeUp (boolean isBarking, int hour) {
        if ((isBarking && hour < 8 && hour > 0) || (isBarking && hour > 22 && hour < 23)) {
            return true;
        }
        return false;
    }
}
