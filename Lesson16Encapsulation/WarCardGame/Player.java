package warCardGame;

public class Player {

    private String name;
    private Card[] hand;
    private Card[] profit;

    Player (String name) {
        if (name.trim().length() > 1) {
            this.name = name;
        }
        else {
            this.name = "Unknown";
        }
        this.hand = new Card[Deck.DECK_SIZE/2];
        this.profit = new Card[Deck.DECK_SIZE];
    }
}
