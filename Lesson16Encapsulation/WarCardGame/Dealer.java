package warCardGame;

import java.util.Random;

public class Dealer {

    public static void dealCards() {
        System.out.println("The Dealer is dealing the cards between players.");

    }

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
}
