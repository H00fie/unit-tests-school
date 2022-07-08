package bm.app.battleOfBannockburnKata;

public class BannockburnBattle {

    ChristianMagic christianMagic;

    public BannockburnBattle(ChristianMagic christianMagic) {
        this.christianMagic = christianMagic;
    }

    public void formUp(Scottish warrior){
        warrior.setInFormation(true);
    }

    public void infantryCharge(English englishWarrior, Scottish scottishWarrior) {
        int damageDealt = calculateDamageDealt(englishWarrior.getPower(), scottishWarrior.getArmourType());
        scottishWarrior.setHealthPool(scottishWarrior.getHealthPool() - damageDealt);
    }

    public void cavalryCharge(Scottish scottishKnights, English englishKnights) {
        regroupAfterAFailedChargeAtPikemen(englishKnights);
        int damageDealt = calculateDamageDealt(scottishKnights.getPower(), englishKnights.getArmourType());
        englishKnights.setHealthPool(englishKnights.getHealthPool() - damageDealt);
        if (checkifAlive(englishKnights)) {
            englishKnights.setAlive(false);
        }
    }

    public void castRessurectionSpell(Scottish warriors) {
        warriors.setHealthPool(warriors.getHealthPool() + christianMagic.castRessurection());
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

    private void regroupAfterAFailedChargeAtPikemen(English englishKnights) {
        englishKnights.setHealthPool(50);
    }

    private boolean checkifAlive(English unit) {
        if (unit.getHealthPool() < 0) {
            return false;
        }
        return true;
    }
}
