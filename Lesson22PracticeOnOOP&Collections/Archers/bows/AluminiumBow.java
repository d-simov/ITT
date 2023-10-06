package archers.bows;

public class AluminiumBow extends SeniorBow{

    public AluminiumBow(String manufacturer, double weight, int drawWeight) {
        super(manufacturer, weight, drawWeight);
        this.scope = 1;
    }

    @Override
    protected boolean validDrawWeight(int drawWeight) {
        return drawWeight >= 25 && drawWeight <= 40;
    }
}
