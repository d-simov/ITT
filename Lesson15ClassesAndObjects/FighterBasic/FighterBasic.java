package Task02FighterBasic;

public class FighterBasic {

    String name;
    int maxHealth;
    int lifePoints;
    int damage;

    void hit(FighterBasic enemy){
        enemy.lifePoints -= damage;
        System.out.println(name + " hits " + enemy.name + " for " + damage + " damage." + enemy.name + " is left with " + enemy.lifePoints + " hp.");
    }
    boolean isAlive() {
        return lifePoints > 0;
    }


}
