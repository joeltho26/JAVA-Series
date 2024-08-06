public class TeenNumberCheckerChallenge {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen (int x, int y, int z) {
        if ((x > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20)) {
            return true;
        }
        return false;
    }
}
