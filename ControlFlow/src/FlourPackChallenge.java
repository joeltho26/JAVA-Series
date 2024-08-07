public class FlourPackChallenge {
    public static void main(String[] args) {
        System.out.println(flourPack(1, 0, 4));
        System.out.println(flourPack(1, 0, 5));
        System.out.println(flourPack(0, 5, 4));
        System.out.println(flourPack(2, 2, 11));
        System.out.println(flourPack(-3, 2, 12));
    }

    public static boolean flourPack(int bigBags, int smallBags, int goal) {
        if (bigBags>=0 || smallBags>=0) {
            int bigBagsTotal = bigBags * 5;
            int smallBagsTotal = smallBags;
            if (bigBagsTotal>goal) {
                return false;
            } else if ((smallBagsTotal+bigBagsTotal)<goal) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
