public class SumOddChallenge {
    public static void main(String[] args) {
        System.out.println(sumOdd(10));
    }

    public static int sumOdd(int number) {
        StringBuilder values = new StringBuilder();
        int sum = 0;
        for (int i=1; i<=number; i++) {
            if (i%2==0) {
                continue;
            }
            sum += i;
            values.append(i).append(",");
        }
        System.out.println(values.substring(0,values.length()-1));
        return sum;
    }


}
