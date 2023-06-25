package BirdsOnATree;

public class Tree {

    private TreeType type;
    private final int capacity;
    private int freePlaces;
    private int birdsOnTheTree;


    public Tree(TreeType type, int capacity) {
        this.type = type;
        if (capacity >= 10 && capacity < 501) {
            this.capacity = capacity;
        } else {
            this.capacity = 20;
        }
        this.birdsOnTheTree = 0;
        this.freePlaces = this.capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBirdsOnTheTree() {
        return birdsOnTheTree;
    }

    public void setBirdsOnTheTree(int birdsOnTheTree) {
        this.birdsOnTheTree = birdsOnTheTree;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    void getInfo() {
        System.out.println("I can now see " + this.getBirdsOnTheTree() + " birds on the " + this.type + " and " +
                this.getFreePlaces() + " free places on its branches.");
    }

    public TreeType getType() {
        return type;
    }
}
