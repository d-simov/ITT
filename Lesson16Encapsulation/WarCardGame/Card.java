package warCardGame;

public class Card {

    private char suit;
    private char strength;
    private int strengthValue;

    public Card(char strength, char suit) {
        this.strength = strength;
        this.suit = suit;
        strengthValue = switch (this.strength) {
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case 'T' -> 10;
            case 'J' -> 11;
            case 'Q' -> 12;
            case 'K' -> 13;
            case 'A' -> 14;
            default -> 0;
        };
    }

    public String getInfo() {
        return strength + " of " + suit + ".";
    }

    public boolean greaterThan (Card otherCard) {
        return this.strengthValue > otherCard.strengthValue;
    }

    public boolean equals (Card otherCard) {
        return this.strengthValue == otherCard.strengthValue;
    }
}
