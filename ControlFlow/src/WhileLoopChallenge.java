public class WhileLoopChallenge {
    public static void main(String[] args) {
        StringBuilder evenValues = new StringBuilder();
        StringBuilder oddValues = new StringBuilder();
        int value = 5;
        int counter=0;
        while (value <=20) {
            if (isEvenNumber(value) && counter<5) {
                evenValues.append(value).append(",");
                counter++;
            } else if (isOddNumber(value)) {
                oddValues.append(value).append(",");
            }
            value++;
        }
        System.out.println("The even number are " + evenValues.substring(0,evenValues.length()-1));
        System.out.println("The odd number are " + oddValues.substring(0,oddValues.length()-1));
    }

    public static boolean isEvenNumber(int number) {
        if ((number%2)==0){
            return true;
        }
        return false;
    }

    public static boolean isOddNumber(int number) {
        if ((number%2)!=0){
            return true;
        }
        return false;
    }
}
