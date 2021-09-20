package game;


import battleService.BattleService;
import character.Hero;
import character.WeaponService;
import monsters.MonsterList;
import weapon.Weapon;

public class Start {
    public static void main(String[] args) {
        MonsterList.initializeMonsterList();
        BattleService.fight(Hero.getHero(), MonsterList.chooseEnemy(), WeaponService.chooseWeapon());
    }
}
