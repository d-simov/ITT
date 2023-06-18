package warCardGame;

public class Demo {

    public static void main(String[] args) {

        Deck deck = new Deck();

        Player p1 = new Player("Pesho");
        Player p2 = new Player("Gosho");
        Dealer.shuffleDeck(5);
        Dealer.dealCards(p1, p2, deck);

        int roundCounter = 0;
        while (p1.hasCardsInHand() && p2.hasCardsInHand()) {
            System.out.println("------------------  ROUND" + (++roundCounter) + "------------------");
            Card c1 = p1.draw();
            Card c2 = p2.draw();
            Card[] loot = {c1, c2};
            if (c1.greaterThan(c2)) {
                p1.winCards(loot);
                System.out.println(p1.getName() + " wins the hand of 2.");
            }
            else if (c2.greaterThan(c1)) {
                p2.winCards(loot);
                System.out.println(p2.getName() + " wins the hand of 2.");
            }
            else {
                war(p1, p2, loot);
            }
        }
        System.out.println("End of game!");
        p1.printProfit();
        p2.printProfit();
    }

    private static void war (Player p1, Player p2, Card[] loot) {
        System.out.println(" WAR!!! ");
        Card[] warLoot = new Card[6];
        int warLootCount =0;
        for (int i = 0; i < 3; i++) {
            warLoot[warLootCount++] = p1.draw();
            warLoot[warLootCount++] = p2.draw();
        }
        int lastP1 = 4;
        int lastP2 = 5;
        if (warLoot[lastP1] == null) {
            lastP1 = 2;
            lastP2 = 3;
            if (warLoot[lastP1] == null) {
                lastP1 = 0;
                lastP1 = 1;
            }
        }
        if (warLoot[lastP1].greaterThan(warLoot[lastP2])) {
            p1.winCards(loot);
            p1.winCards(warLoot);
            System.out.println(p1.getName() + " wins the WAR - " + (loot.length + warLoot.length) + " cards!");
        }
        else if (warLoot[lastP2].greaterThan(warLoot[lastP1])) {
            p2.winCards(loot);
            p2.winCards(warLoot);
            System.out.println(p2.getName() + " wins the WAR - " + (loot.length + warLoot.length) + " cards!");
        }
        else {
            Card[] combinedLoot = new Card[loot.length + warLoot.length];
            for (int i = 0; i < loot.length; i++) {
                combinedLoot[i] = loot[i];
            }
            for (int i = loot.length; i < (loot.length + warLoot.length); i++) {
                combinedLoot[i] = warLoot[i];
            }
            if (!p1.hasCardsInHand() || !p2.hasCardsInHand()) {
                return;
            }
            war(p1, p2, combinedLoot);
        }
    }
}
