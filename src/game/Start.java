package game;


import battleService.BattleService;
import character.Hero;
import monsters.MonsterList;

public class Start {
    public static void main(String[] args) {
        MonsterList.initializeMonsterList();
        BattleService.fight(Hero.getHero(), MonsterList.chooseEnemy());
    }
}
