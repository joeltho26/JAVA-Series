package Example.HashSet.PlayingCard;

public class PlayingCard {
    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = 1;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

//    @Override
//    public int hashCode() {
//        return internalHash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("----> Checking Playing Card equality");
//        return true;
//    }

    // using code generation from menu option and not checking the box for both suit and face for null value:
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PlayingCard that = (PlayingCard) o;
//        return Objects.equals(suit, that.suit) && Objects.equals(face, that.face);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hashCode(suit);
//        result = 31 * result + Objects.hashCode(face);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard that = (PlayingCard) o;
        return suit.equals(that.suit) && face.equals(that.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }
}
