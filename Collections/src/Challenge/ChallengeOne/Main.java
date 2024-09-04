package Challenge.ChallengeOne;

import com.sun.jdi.ObjectCollectedException;

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

        Card tenofHearts = Card.getNumericCard(Card.Suit.HEART,10);
        int foundIndex = Collections.binarySearch(deck,tenofHearts,sortingAlgorithm);
        System.out.println("Found Index: " + foundIndex);
        System.out.println("Value at found index: " + deck.get(foundIndex));



    }
}
