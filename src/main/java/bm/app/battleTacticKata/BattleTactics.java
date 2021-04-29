package bm.app.battleTacticKata;

import java.util.Map;

public class BattleTactics {

    public boolean isFormationClosed(boolean ifArchersFormedUp) {
        return ifArchersFormedUp ? true : false;
    }

    public boolean areHetairoiOnTheFlank(boolean ifHornsBlown) {
        return ifHornsBlown ? true : false;
    }

    public int countTheNumbersOfAUnitType(Map<String, Integer> armyComposition, String unitName) {
        return armyComposition.get(unitName);
    }

    public void chargeOfTheHetairoi(String enemyUnitToAttack, Map<String, Integer> enemyArmy) {
        enemyArmy.put(enemyUnitToAttack, enemyArmy.get(enemyUnitToAttack) - 3000);
    }

    public void shieldsUpAndBraceForImpact(int incomingDamage, String unitName, Map<String, Integer> armyComposition) {
        switch (unitName) {
            case "Immortals":
                dealDamage(0, unitName, armyComposition);
                break;
            case "Phalangites":
                dealDamage(incomingDamage / 2, unitName, armyComposition);
                break;
            case "Hetairoi":
            case "BactrianCavalry":
                dealDamage(incomingDamage - (incomingDamage / 4), unitName, armyComposition);
                break;
            default:
                dealDamage(incomingDamage, unitName, armyComposition);
        }
    }

    private void dealDamage(int damageDealt, String unitName, Map<String, Integer> army) {
        army.put(unitName, army.get(unitName) - damageDealt);
    }


}
