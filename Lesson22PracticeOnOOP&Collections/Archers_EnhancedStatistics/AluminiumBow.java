package main.bows;

public class AluminiumBow extends SeniorBow {


    public AluminiumBow(int drawStrength) {
        super(drawStrength);
        this.scope = 1;
    }

    @Override
    protected boolean validDrawStrength(int drawStrength) {
        return drawStrength >= 25 && drawStrength <=40;
    }

    @Override
    public int getBonusPoints() {
        return this.scope;
    }
}
