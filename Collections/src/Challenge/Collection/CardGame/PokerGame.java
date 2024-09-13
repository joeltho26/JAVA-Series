package Challenge.Collection.CardGame;

import java.util.*;
import java.util.function.Consumer;

public class PokerGame {
    private final List<Card> deck = Card.getStandardDeck();
    private int players;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

    public PokerGame(int players, int cardsInHand) {
        this.players = players;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay() {
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomMiddle = new Random().nextInt(15,35);
        Collections.rotate(deck,randomMiddle);
        Card.printDeck(deck);

        deal();
        System.out.println("-".repeat(25));
        Consumer<PokerHand> checkHand = PokerHand::evalHand;
        pokerHands.forEach(checkHand.andThen(System.out::println));

        int cardsDealt = players * cardsInHand;
        int cardsRemaining = deck.size()-cardsDealt;

        remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining,null));
        remainingCards.replaceAll(c -> deck.get(cardsDealt+remainingCards.indexOf(c)));
        Card.printDeck(remainingCards);

    }

    private void deal() {
        Card[][] hands = new Card[players][cardsInHand];
        for(int deckIndex=0, i=0; i<cardsInHand; i++) {
            for(int j=0; j<players; j++) {
                hands[j][i] = deck.get(deckIndex++);
            }
        }
        int playerNo = 1;
        for(Card[] hand: hands) {
            pokerHands.add(new PokerHand(playerNo, Arrays.asList(hand)));
            playerNo++;
        }
    }
}
