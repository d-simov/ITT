package main.bows;

public class CarbonBow extends SeniorBow {

    private final static int STABILIZER = 1;

    public CarbonBow(int drawStrength) {
        super(drawStrength);
        this.scope = 2;
    }

    @Override
    protected boolean validDrawStrength(int drawStrength) {
        return drawStrength >= 28 && drawStrength <= 48;
    }

    @Override
    public int getBonusPoints() {
        return this.scope + CarbonBow.STABILIZER;
    }
}
