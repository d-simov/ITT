package warCardGame;

public class Player {

    private String name;
    private Card[] hand;
    private Card[] profit;
    private int cardsInHand = 0;
    private int cardsInProfit = 0;

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

    public void acceptCard (Card card) {
        hand[cardsInHand++] = card;
    }

    public Card draw() {
        if (hasCardsInHand()) {
            cardsInHand--;
            Card card = hand[cardsInHand];
            hand[cardsInHand] = null;
            cardsInHand--;
            System.out.println(this.name + " draws " + card.getInfo());
            return card;
        } else {
            return null;
        }
    }

    public boolean hasCardsInHand() {
        return cardsInHand > 0;
    }

    public void winCards (Card[] cards) {
        for (Card card : cards) {
            profit[cardsInProfit++] = card;
        }
    }

    public String getName() {
        return name;
    }

    public void printHand() {
        System.out.println( this.name + " has " + cardsInHand + " cards in hand:");
        for (int i = 0; i < cardsInHand; i++) {
            System.out.println(this.hand[i].getInfo());
        }
    }

    public void printProfit() {
        System.out.println(this.name + " has won " + cardsInProfit + " cards:");
        for (int i = 0; i < cardsInProfit; i++) {
            System.out.println(this.profit[i].getInfo());
        }
    }

}
