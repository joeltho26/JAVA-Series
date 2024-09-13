package Challenge.Collection.CardGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Card(Suit suit, String face, int rank) {
    public enum Suit {
        CLUB,HEART,SPADE,DIAMOND;

        public char getImage() {
            return (new char[]{9827,9830,9829,9824}[this.ordinal()]);
        }
    }

    public static Comparator<Card> sortRankReversedSuit() {
        return Comparator.comparing(Card::rank).reversed().
                thenComparing(Card::suit);
    }

    @Override
   public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0,index);
        return "%s%c(%d)".formatted(faceString,suit.getImage(),rank);
   }

    public static Card getNumericCard(Suit suit, int cardNumber) {
        if(cardNumber>1 && cardNumber<11) {
            return (new Card(suit,String.valueOf(cardNumber),cardNumber-2));
        }
        System.out.println("Invalid Numeric card");
        return null;
    }

    public static Card getFaceCard(Suit suit, char face) {
        int charIndex = "JQKA".indexOf(face);
        if("JQKA".contains(String.valueOf(face))) {
            return (new Card(suit, "" + face, charIndex+9));
        }
        System.out.println("Invalid Face card");
        return null;
    }

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>(52);
        for(Suit suit: Suit.values()) {
            for (int i = 2; i < 11; i++) {
                deck.add(Card.getNumericCard(suit,i));
            }
            for (char i: new char[]{'J','Q','K','A'}) {
                deck.add(Card.getFaceCard(suit,i));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Deck of cards",4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("-".repeat(25));
        if (description != null) {
            System.out.println(description);
        }
        int rowSize = deck.size()/rows;
        for(int i = 0; i<rows; i++) {
            int startIndex = i * rowSize;
            int endIndex = startIndex + rowSize;
            deck.subList(startIndex,endIndex).forEach(s -> System.out.print( " " + s));
            System.out.println();
        }
    }
}

