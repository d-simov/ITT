package main.bows;

public class WoodenBow extends  Bow {

    public WoodenBow(int drawStrength) {
        super(drawStrength);
    }

    @Override
    protected boolean validDrawStrength(int drawStrength) {
        return drawStrength >= 20 && drawStrength <=30;
    }

    @Override
    public int getBonusPoints() {
        return 0;
    }
}
