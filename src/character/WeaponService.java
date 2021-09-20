package character;

import weapon.Weapon;

import java.util.*;

public class WeaponService {
    public static final Map<Integer, Weapon> weapList = new HashMap<>();

    public static void initWeapon() {
        weapList.put(1, new Weapon("Кинжал", 7, 3));
        weapList.put(2, new Weapon("Меч", 10, 2));
        weapList.put(3, new Weapon("Топор", 21, 1));
    }

    public static Weapon chooseWeapon() {
        System.out.println("Выберите оружие: (1)Кинжал, (2)Меч, (3)Топор.");
        System.out.println("У кинжала 7 урона (hard)\nУ меча 10 урона (medium)\nУ топора 21 урона (easy)");
        Weapon chooseWeapon = null;
        while (chooseWeapon == null) {
            chooseWeapon = weapList.get(InputService.inputNumber());
        }
        return chooseWeapon;
    }
}


