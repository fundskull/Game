package character;

import weapon.Weapon;

import java.lang.ref.WeakReference;
import java.util.Scanner;

public class Hero extends Character {
    private int rightHand;
    private int leftHand;

    public Hero(String name, int health, int damage, int rightHand, int leftHand) {
        super(name, health, damage);
        this.rightHand = rightHand;
        this.leftHand = leftHand;
    }

    public static Hero getHero() {
        Hero hero = new Hero(null,30, 0, 1, 1);
        hero.setName(InputService.inputNickname());
        hero.setHealth(80);
        WeaponService.initWeapon();
        Weapon takeWeapon = WeaponService.chooseWeapon();
        hero.setRightHand(takeWeapon.getDamage());

        return hero;
    }

    public int getRightHand() {
        return rightHand;
    }

    public void setRightHand(int rightHand) {
        this.rightHand = rightHand;
    }

    public int getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(int leftHand) {
        this.leftHand = leftHand;
    }
}
