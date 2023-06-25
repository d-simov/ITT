package BirdsOnATree;

public class Demo {

    public static void main(String[] args) {


        Flock flock = new Flock(BirdType.SPARROW, 23);
        Tree tree1 = new Tree(TreeType.BIRCH,18);
        Tree tree2 = new Tree(TreeType.OAK,100);

        System.out.println();
        flock.getInfo();

        flock.land(tree1);

        tree1.getInfo();

        flock.flyAway(tree1);
        flock.getInfo();

        flock.land(tree2);
        tree1.getInfo();
        tree2.getInfo();

        System.out.println();
        flock.getInfo();
        flock.flyAway(tree1);

        flock.flyAway(tree2);
        flock.getInfo();

    }
}
