package main.bows;

public abstract class SeniorBow extends Bow {

    protected int scope;

    public SeniorBow(int drawStrength) {
        super(drawStrength);

    }

    @Override
    public abstract int getBonusPoints();
}
