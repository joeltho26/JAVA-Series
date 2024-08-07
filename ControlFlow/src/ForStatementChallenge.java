public class ForStatementChallenge {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(9));
        System.out.println(isPrimeNumber(19));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(3));
        System.out.println(isPrimeNumber(14));
        System.out.println("----------------");
        printPrimeNumber(153);
    }

    public static boolean isPrimeNumber (int number) {
        if (number>1) {
            for (int i=2; i<number;i++) {
                if ((number%i)==0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void printPrimeNumber (int number) {
        StringBuilder primeNumbers = new StringBuilder();
        int counter=0;
        for (int i=2; i<number; i++) {
            if (isPrimeNumber(i) && counter<10) {
                primeNumbers.append(i).append(",");
                counter++;
            }
        }
        System.out.println(primeNumbers.substring(0,primeNumbers.length()-1));
        System.out.println("The number of prime numbers found are: " + counter);
    }
}
