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


}
