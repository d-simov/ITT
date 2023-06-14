package warCardGame;

public class Deck {

    public static final int DECK_SIZE = 52;
    public static final int SUIT_NUMBER = 4;
    public static final int STRENGTH_NUMBER = 13;
    private static Card[] cards = new Card[DECK_SIZE];

    public Deck () {
        int numberInLine = 0;
        for (int i = 0; i < STRENGTH_NUMBER; i++) {
            for (int j = 0; j < SUIT_NUMBER; j++) {
                cards[numberInLine++] = new Card(getStrength(i), getSuit(j));
            }
        }
    }

    private char getStrength(int i) {
        return switch (i) {
            case 0 -> '2';
            case 1 -> '3';
            case 2 -> '4';
            case 3 -> '5';
            case 4 -> '6';
            case 5 -> '7';
            case 6 -> '8';
            case 7 -> '9';
            case 8 -> 'T';
            case 9 -> 'J';
            case 10 -> 'Q';
            case 11 -> 'K';
            case 12 -> 'A';
            default -> '0';
        };
    }

    private char getSuit(int j) {
        return switch (j) {
            case 0 -> '\u2663';
            case 1 -> '\u2666';
            case 2 -> '\u2665';
            case 3 -> '\u2660';
            default -> ' ';
        };
    }

    public void print () {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].getInfo());
        }
    }

    public static Card[] getCards() {
        return cards;
    }
}
