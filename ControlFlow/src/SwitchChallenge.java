public class SwitchChallenge {
    public static void main(String[] args) {
        String input = "ABCD";
        Character[] charList = new Character[input.length()];
        for (int i=0; i<charList.length; i++) {
            charList[i] = input.charAt(i);
            switch (charList[i]) {
                case 'A':
                     System.out.println("Able");
                     break;
                case 'B':
                    System.out.println("Baker");
                    break;
                case 'C':
                    System.out.println("Charlie");
                    break;
                case 'D':
                    System.out.println("Dog");
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }

    }
}
