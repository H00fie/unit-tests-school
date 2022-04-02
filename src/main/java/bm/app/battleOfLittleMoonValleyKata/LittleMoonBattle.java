package bm.app.battleOfLittleMoonValleyKata;

import java.util.HashMap;
import java.util.Map;

public class LittleMoonBattle {

    MagicOfFilth magicOfFilth;

    public LittleMoonBattle(MagicOfFilth magicOfFilth) {
        this.magicOfFilth = magicOfFilth;
    }

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

    // Switch expressions!!!
//    public Weapon dispenseWeapons(Unit unit) {
//        return switch(unit) {
//            case CROSSBOWMEN -> Weapon.CROSSBOW;
//            case PIKEMEN -> Weapon.PIKE;
//            case THUNDERERS -> Weapon.HANDGUN;
//            case SHIELD_BEARERS -> Weapon.SWORD;
//            case SLAYERS, OATHKEEPERS, ROCK_HANDS -> {
//                var weapon = unit == Unit.SLAYERS ? Weapon.AXE : Weapon.HAMMER;
//                yield weapon;
//            }
//            default -> Weapon.NONE;
//        };
//    }

    public void castBlessingOfFilth(Foe foe) {
        foe.setPower(foe.getPower() + magicOfFilth.blessingOfFilth());
    }

    public Map<Unit, Integer> getArmyOfRodghalikan() {
        return armyOfRodghalikan;
    }
}
