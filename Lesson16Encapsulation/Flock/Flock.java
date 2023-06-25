package BirdsOnATree;

public class Flock {

    private BirdType type;
    private Bird[] birds;
    private int flockSize;
    private int birdsLanded;

    public int getBirdsLanded() {
        return birdsLanded;
    }

    public int getBirdsInTheAir() {
        return birdsInTheAir;
    }

    private int birdsInTheAir;

    public Flock(BirdType type, int flockSize) {
        this.type = type;
        if (flockSize > 1 && flockSize < 1000) {
            this.flockSize = flockSize;
        } else {
            this.flockSize = 10;
        }
        birds = new Bird[this.flockSize];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = new Bird(this.type);
        }
        this.birdsLanded = 0;
        this.birdsInTheAir = this.flockSize;
    }

    public void land (Tree tree) {
        System.out.println();
        if (flockSize <= tree.getCapacity()) {
            tree.setBirdsOnTheTree(flockSize);
            tree.setFreePlaces(tree.getFreePlaces() - tree.getBirdsOnTheTree());
            this.birdsLanded = flockSize;
            this.birdsInTheAir = 0;
        }
        else {
            tree.setBirdsOnTheTree(tree.getFreePlaces());
            tree.setFreePlaces(0);
            this.birdsLanded = tree.getBirdsOnTheTree();
            this.birdsInTheAir -= tree.getBirdsOnTheTree();
        }
        System.out.println(this.birdsLanded + " birds from the flock landed on a " + tree.getType() + " and " +
                this.birdsInTheAir + " birds from the flock are still flying around.");
    }

    void flyAway (Tree tree) {
        if (tree.getFreePlaces() < tree.getCapacity()) {
            System.out.println();
            this.birdsInTheAir += tree.getBirdsOnTheTree();
            this.birdsLanded -= tree.getBirdsOnTheTree();
            tree.setFreePlaces(tree.getFreePlaces() + tree.getBirdsOnTheTree());
            tree.setBirdsOnTheTree(0);
            System.out.println("The flock flew away from the " + tree.getType() + ".");
        }
        else {
            System.out.println("There is no flock on the " + tree.getType() + ".");
            if (this.birdsInTheAir == this.flockSize) {
                System.out.println("Your flock is still flying around somewhere.");
            }
            else {
                System.out.println("Your flock is on another tree.");
            }
        }
    }

    public void getInfo() {
        System.out.println(this.getBirdsLanded() + " birds from the flock are landed on a tree and " + this.getBirdsInTheAir() +
                " birds from the flock are flying around.");
    }
}
