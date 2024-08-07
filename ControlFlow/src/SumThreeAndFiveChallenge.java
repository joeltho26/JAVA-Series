public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        getCommonDivisor(100);
    }

    public static void getCommonDivisor(int number) {
        StringBuilder values = new StringBuilder();
        int counter = 0;
        for (int i=1; i<=number; i++) {
            if (counter < 5) {
                if (((i % 3) == 0) && ((i % 5) == 0)) {
                    values.append(i).append(",");
                    counter++;
                }
            }
        }
        System.out.println(values.substring(0,values.length()-1));
    }
}
