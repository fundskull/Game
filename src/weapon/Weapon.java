package weapon;

public class Weapon {
    String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }




}
