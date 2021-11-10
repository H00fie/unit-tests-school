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

    public int dealRangedDamage(Unit unit, Foe foe) {
        int result = 0;
        switch (unit) {
            case CROSSBOWMEN:
                switch (foe.getArmour()) {
                    case NONE:
                        result = unit.getPower() * 2;
                        break;
                    case LINEN:
                        result = unit.getPower() + (unit.getPower() / 2);
                        break;
                }
        }
        return result;
    }

    public Map<Unit, Integer> getArmyOfRodghalikan() {
        return armyOfRodghalikan;
    }
}
