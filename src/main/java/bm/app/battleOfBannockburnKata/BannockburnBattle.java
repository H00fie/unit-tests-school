package bm.app.battleOfBannockburnKata;

public class BannockburnBattle {

    public void formUp(Scottish warrior){
        warrior.setInFormation(true);
    }

    public void infantryCharge(English englishWarrior, Scottish scottishWarrior) {
        int damageDealt = calculateDamageDealt(englishWarrior.getPower(), scottishWarrior.getArmourType());
        scottishWarrior.setHealthPool(scottishWarrior.getHealthPool() - damageDealt);
    }

    private int calculateDamageDealt(int attackerPower, ArmourType defendersArmour) {
        int damageDealt = 0;
        switch (defendersArmour) {
            case UNARMOURED -> damageDealt = attackerPower;
            case LEATHER -> damageDealt = attackerPower - (attackerPower / 10);
            case MAIL -> damageDealt = attackerPower - (attackerPower / 4);
            case HALF_PLATE -> damageDealt = attackerPower / 2;
            case FULL_PLATE -> damageDealt = attackerPower / 4;
        }
        return damageDealt;
    }
}
