package Challenge.Collection.Card;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings", 1);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Collection Deck shuffled", 1);

        Collections.reverse(deck);
        Card.printDeck(deck, "Collection Reverse shuffled", 1);

        var sortingAlgorithm = Comparator.comparing(Card::rank).
                thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Collection sorting rank-wise:", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "Collection sorting rank-wise from high to low:", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings, "Collection Kings", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens, "Collection tens", 1);

        int subListIndex = Collections.indexOfSubList(deck,kings);
        System.out.println("Index for Kings: " + subListIndex);
        System.out.println(deck.containsAll(kings));

        Collections.shuffle(deck);

        int subListIndex1 = Collections.indexOfSubList(deck,kings);
        System.out.println("Index for Kings: " + subListIndex1);
        System.out.println(new HashSet<>(deck).containsAll(kings));

        boolean disjointValue = Collections.disjoint(deck,tens);
        System.out.println("Disjoint: " + disjointValue);

        boolean disjointValue1 = Collections.disjoint(kings,tens);
        System.out.println("Disjoint: " + disjointValue1);

        deck.sort(sortingAlgorithm);
        Card tenofHearts = Card.getNumericCard(Card.Suit.HEART,10);
        int foundIndex = Collections.binarySearch(deck,tenofHearts,sortingAlgorithm);
        System.out.println("Found Index: " + foundIndex);
        System.out.println("Value at found index: " + deck.get(foundIndex));

        Collections.replaceAll(deck, Card.getNumericCard(Card.Suit.CLUB,10),
                Card.getNumericCard(Card.Suit.HEART,10));
        Card.printDeck(deck.subList(32,36),"Ten Rows",1);

        Card tenOfSpade = Card.getNumericCard(Card.Suit.SPADE,10);
        if(Collections.replaceAll(deck,Card.getNumericCard(Card.Suit.CLUB,10),tenOfSpade)) {
            System.out.println("Card found!");
        } else {
            System.out.println("No clubs of ten found");
        }

        System.out.println(Collections.frequency(deck,tenOfSpade));
        System.out.println(Collections.frequency(deck,Card.getNumericCard(Card.Suit.HEART, 10)));
        System.out.println(Collections.frequency(deck,Card.getNumericCard(Card.Suit.CLUB, 10)));

        System.out.println(Collections.min(deck, sortingAlgorithm));
        System.out.println(Collections.max(deck, sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::face);
        deck.sort(sortBySuit);
        Card.printDeck(deck);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,2);
        System.out.println("Unrotated: " + deck.subList(0,13));
        System.out.println("Rotated: " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,-2);
        System.out.println("Unrotated: " + deck.subList(0,13));
        System.out.println("Rotated: " + copied);

        Collections.swap(copied,0,10);
        System.out.println("Swapped: " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        for(int i=0; i < copied.size(); i++) {
            Collections.swap(copied,i,copied.size() - i - 1);
        }
        System.out.println("Manual Reverse: " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.reverse(copied);
        System.out.println(copied);


    }
}
