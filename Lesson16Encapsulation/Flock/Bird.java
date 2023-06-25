package BirdsOnATree;

public class Bird {

    private BirdType type;
    private double weight;

    Bird (BirdType type) {
        this.type = type;
        this.weight = 0.1;
    }

    public void setWeight(double weight) {
        if (weight > 0.02 && weight < 5.1) {
            this.weight = weight;
        }
    }
}
