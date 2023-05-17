package fighter;

public class CombatDemo {

    public static void main(String[] args) {

        Fighter dido = new Fighter("Dido", 120, 4);
        Fighter krasi = new Fighter("Krasi", 200, 2);
        dido.setWeapon(Weapon.SWORD);
        krasi.setWeapon(Weapon.KNIFE);

        while (dido.getHealthPoints() > 0 && krasi.getHealthPoints() > 0) {
            if (dido.isAlive()) {
                dido.hit(krasi);
            }
            else {
                System.out.println(krasi.getName() + " wins.\n");
            }
            if (krasi.isAlive()) {
                krasi.hit(dido);
            }
            else {
                System.out.println(dido.getName() + " wins.\n");
            }
        }
        if (dido.isAlive()) {
            System.out.println(dido.getName() + " wins. " + dido.getName() + " has " + dido.getHealthPoints() +
                    " HP left.");
        }
        else {
            System.out.println(krasi.getName() + " wins. " + krasi.getName() + " has " + krasi.getHealthPoints() +
                    " HP left.");
        }
    }
}
