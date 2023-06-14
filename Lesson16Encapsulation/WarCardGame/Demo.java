package warCardGame;

public class Demo {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.print();
        Dealer.shuffleDeck(5);
        Dealer.dealCards();
        System.out.println("-----------------------------------------------------");
        deck.print();
    }
}
