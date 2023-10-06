package archers.bows;

public abstract class SeniorBow extends Bow{

    protected int scope;

    public SeniorBow(String manufacturer, double weight, int drawWeight) {
        super(manufacturer, weight, drawWeight);
    }

    @Override
    public int getBonus() {
        return super.getBonus() + scope;
    }
}
