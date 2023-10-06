package archers.bows;

public class WoodenBow extends Bow{

    public WoodenBow(String manufacturer, double weight, int drawWeight) {
        super(manufacturer, weight, drawWeight);
    }

    @Override
    protected boolean validDrawWeight(int drawWeight) {
        return drawWeight >= 20 && drawWeight <= 30;
    }
}
