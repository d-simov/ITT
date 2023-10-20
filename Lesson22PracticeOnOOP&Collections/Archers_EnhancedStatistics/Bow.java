package main.bows;

import java.util.Random;

public abstract class Bow {

    private String manufacturer;
    private double weight;
    private int drawStrength;

    public Bow(int drawStrength) {
        this.manufacturer = "Hoyt";
        this.weight = (new Random().nextInt(36) + 15 )/10;
        if (validDrawStrength(drawStrength)) {
            this.drawStrength = drawStrength;
        }
        else {
            this.drawStrength = 29;
        }
    }

    protected abstract boolean validDrawStrength(int drawStrength);

    public abstract int getBonusPoints();

    public double getWeight() {
        return weight;
    }

    public int getDrawStrength() {
        return drawStrength;
    }
}
