package archers.bows;

public class CarbonBow extends SeniorBow{

    private int stabilizer = 1;

    public CarbonBow(String manufacturer, double weight, int drawWeight) {
        super(manufacturer, weight, drawWeight);
        this.scope = 2;
    }

    @Override
    public int getBonus() {
        return super.getBonus()  +stabilizer;
    }

    @Override
    protected boolean validDrawWeight(int drawWeight) {
        return drawWeight >= 28 && drawWeight <= 48;
    }
}
