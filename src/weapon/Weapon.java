package weapon;

public class Weapon {
    private String name;
    private int damage;
    private int attackCount;

    public Weapon(String name, int damage, int attackCount) {
        this.damage = damage;
        this.name = name;
        this.attackCount = attackCount;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAttackCount() {
        return attackCount;
    }
    public void setAttackCount(int attackCount) {
        this.attackCount = attackCount;
    }
}
