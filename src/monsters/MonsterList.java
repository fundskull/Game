package monsters;

import character.Enemy;
import character.InputService;
import weapon.Weapon;

import java.util.HashMap;
import java.util.Map;

public class MonsterList {

    private static final Map<Integer, Enemy> monsterList= new HashMap<>();

    public static Map<Integer, Enemy> initializeMonsterList() {
        monsterList.put(1, new Enemy("Троглодит", 50, 12));
        monsterList.put(2, new Enemy("Гоблин", 45, 15));
        monsterList.put(3, new Enemy("Орк", 80, 19));
        System.out.println("Список существующих монстров: ");
        for (Map.Entry<Integer, Enemy> entry :  monsterList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        return monsterList;
    }

    public static Map<Integer, Enemy> getMonsterList() {
        return monsterList;
    }

    public static Enemy chooseEnemy() {
        System.out.println("Выберите противника: (1)Троглодит, (2)Гоблин, (3)Орк");
        System.out.println("У троглодита 50 хп и 12 урона\nУ гоблина 45 хп и 15 урона\nУ орка 80 хп и 19 урона");
        Enemy chooseEnemy = null;
        while (chooseEnemy == null) {
            chooseEnemy = monsterList.get(InputService.inputNumber());
        }
        return chooseEnemy;
    }


}
