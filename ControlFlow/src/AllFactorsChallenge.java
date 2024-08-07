public class AllFactorsChallenge {
    public static void main(String[] args) {
        System.out.println(allFactors(6));
        System.out.println(allFactors(32));
        System.out.println(allFactors(10));
        System.out.println(allFactors(-1));
    }

    public static String allFactors (int number) {
        StringBuilder values = new StringBuilder();
        if (number>1) {
            for (int i=1; i<=number; i++) {
                if ((number%i)==0) {
                    values.append(i).append(",");
                }
            }
            return values.substring(0,values.length()-1);
        } else {
            return "Invalid Value";
        }
    }
}
