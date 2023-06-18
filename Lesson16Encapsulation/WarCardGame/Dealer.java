package warCardGame;

import java.util.Random;

public class Dealer {

    public static void shuffleDeck (int times) {
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < Deck.getCards().length; j++) {
                int randomCardIndex = new Random().nextInt(Deck.DECK_SIZE);
                Card temp = Deck.getCards()[i];
                Deck.getCards()[i] = Deck.getCards()[randomCardIndex];
                Deck.getCards()[randomCardIndex] = temp;
            }
        }
        System.out.println("The Dealer shuffled the deck " + times + " times.");
    }

    public static void dealCards (Player p1, Player p2, Deck deck) {
        for (int i = 0; i < Deck.DECK_SIZE/2; i++) {
            p1.acceptCard(deck.draw());
            p2.acceptCard(deck.draw());
        }
        System.out.println("The Dealer is dealing the cards between players " + p1.getName() + " and " + p2.getName() + ".");
    }
}
