package bm.app.battleOfLittleMoonValleyKata;

import java.util.HashMap;
import java.util.Map;

public class LittleMoonBattle {

    private Map<Unit, Integer> armyOfRodghalikan = new HashMap<>();

    public Unit callForces(String name, int quantity) {
        switch (name) {
            case "Crossbowmen":
                armyOfRodghalikan.put(Unit.CROSSBOWMEN, quantity);
                return Unit.CROSSBOWMEN;
            case "Pikemen":
                armyOfRodghalikan.put(Unit.PIKEMEN, quantity);
                return Unit.PIKEMEN;
            default:
                return null;
        }
    }

    public Map<Unit, Integer> getArmyOfRodghalikan() {
        return armyOfRodghalikan;
    }
}
