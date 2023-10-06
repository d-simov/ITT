package archers.bows;

public abstract class Bow {

    private String manufacturer;
    private double weight;
    private int drawWeight;

    public Bow(String manufacturer, double weight, int drawWeight) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        if(validDrawWeight(drawWeight)) {
            this.drawWeight = drawWeight;
        }
    }

    public int getBonus(){
        return 0;
    }

    protected abstract boolean validDrawWeight(int drawWeight);
}
