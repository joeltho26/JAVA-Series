package Example.HashSet.PlayingCard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = String.valueOf("Hello");
        String fText = "hello".replace('h','H');
        String cText = String.join("l","he","lo");
        String dText = String.format("%s","Hello");
        String eText = "Hello".transform(String::toUpperCase);

        System.out.println(bText.hashCode());
        List<String> list = Arrays.asList(aText,bText,fText,cText,dText,eText);
        list.forEach(s -> System.out.println(s + " " + s.hashCode()));
        System.out.println("-".repeat(25));

        Set<String> stringSet = new HashSet<>(list);
        stringSet.forEach(s -> System.out.println(s + " " + s.hashCode()));
        System.out.println("-".repeat(25));

        for (String set: stringSet) {
            System.out.println(set);
            for (int i = 0; i < list.size(); i++) {
                if (set.equals(list.get(i))) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }
        System.out.println("-".repeat(25));

        for (String set: stringSet) {
            System.out.println(set);
            for (int i = 0; i < list.size(); i++) {
                if (set == list.get(i)) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }

        System.out.println("-".repeat(25));
        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards = Arrays.asList(aceHearts,kingClubs,queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        System.out.println("-".repeat(25));
        Set<PlayingCard> deck = new HashSet<>();
        for(PlayingCard card: cards) {
            if (!deck.add(card)) {
                System.out.println("Found a duplicate " + card);
            }
        }
        deck.forEach(System.out::println);

    }
}
