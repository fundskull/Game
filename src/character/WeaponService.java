package character;

import weapon.Weapon;

import java.util.*;

public class WeaponService {
    public static final Map<Integer, Weapon> weapList = new HashMap<>();

    public static void initWeapon() {
        weapList.put(1, new Weapon("Кинжал", 13));
        weapList.put(2, new Weapon("Меч", 15));
        weapList.put(3, new Weapon("Топор", 18));
    }

    public static Weapon chooseWeapon() {
        System.out.println("Выберите оружие: (1)Кинжал, (2)Меч, (3)Топор.");
        System.out.println("У кинжала 13 урона (hard)\nУ меча 15 урона (medium)\nУ топора 18 урона (easy)");
        Weapon chooseWeapon = null;
        while (chooseWeapon == null) {
            chooseWeapon = weapList.get(InputService.inputNumber());
        }
        return chooseWeapon;
    }
}


