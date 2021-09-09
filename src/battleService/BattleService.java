package battleService;

import character.Character;
import character.Enemy;
import character.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BattleService {

    private static final String WRONG_NUMBER = "Выбери число от 1 до 5";

    private static int getTarget() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result;

        while (true) {
            try {
                result = Integer.parseInt(bufferedReader.readLine());
                if (result < 0 || result > 5) {
                    System.out.println(WRONG_NUMBER);
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println(WRONG_NUMBER);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }


    public static void fight(Hero hero, Enemy enemy) {
        int randomEnemyAttack = (int)(Math.random()*5) + 1;
        int randomEnemyBlock = (int)(Math.random()*5) + 1;;

        int heroAttack;
        int heroBlock;


        System.out.println("Бой начинается! Твой противник: " + enemy.getName() + ".");

        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("Выбери точку для удара (1-5)");
            heroAttack = getTarget();
            System.out.println("Выбери точку для блока (1-5)");
            heroBlock = getTarget();

            if (heroAttack == randomEnemyBlock) {
                System.out.println(enemy.getName() + " заблокировал твой удар! У противника осталось: " + enemy.getHealth() +  "хп.");
            } else {
                enemy.takeDamage(hero.getDamage());
                System.out.println("У " + enemy.getName() + "а осталось: " + enemy.getHealth() + " хп.");
            }

            if (heroBlock == randomEnemyAttack) {
                System.out.println(hero.getName() + " удалось заблокировать удар!  У Вас осталось: " + hero.getHealth() +  "хп.");
            } else {
                hero.takeDamage(enemy.getDamage());
                System.out.println("У " + hero.getName() + " осталось: " + hero.getHealth() + " хп.");
            }

            if (hero.getHealth() <= 0 && enemy.getHealth() <= 0) {
                System.out.println("Ничья!");
            } else if (hero.getHealth() <= 0) {
                System.out.println(hero.getName() + " потерпел поражение!");
            } else if (enemy.getHealth() <= 0) {
                System.out.println(hero.getName() + " одержал победу!");
            }
        }
    }
}
