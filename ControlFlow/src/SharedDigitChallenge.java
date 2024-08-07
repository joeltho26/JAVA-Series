public class SharedDigitChallenge {
    public static void main(String[] args) {
        System.out.println(sharedDigit(12, 23));
        System.out.println(sharedDigit(9, 99));
        System.out.println(sharedDigit(15, 55));
    }

    public static boolean sharedDigit (int x, int y) {
        String numX = "" + x;
        String numY = "" + y;
        if ((x>=10 && x<=99) && (y>=10 && y<=99)) {
            for (int i=0; i<numX.length(); i++) {
                for (int j=0; j<numY.length(); j++) {
                    if (Integer.parseInt(String.valueOf(numX.charAt(i))) ==
                            Integer.parseInt(String.valueOf(numY.charAt(j)))) {
                        return true;
                    }
                }
            }
            return false;

        } else {
            return false;
        }
    }
}
