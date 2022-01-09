package bm.app.battleOfCannaeKata;

public class CannaeBattle {

    public void soundTheCharge(Carthaginian carthaginian) {
        if (!carthaginian.isCharging()) {
            carthaginian.setCharging(true);
        }
    }

    public void dealDamage(Carthaginian carthaginian, Roman roman) {
        roman.setHealthPool(roman.getHealthPool() - (carthaginian.getPower() - roman.getDefence()));
        if (roman.getHealthPool() < 0) {
            roman.setAlive(false);
        }
    }

    public UnitStatus checkUnitStatus(Roman roman) {
        if (roman.isAlive()) {
            return UnitStatus.ALIVE;
        } else {
            return UnitStatus.DEAD;
        }
    }

    public void applyHealingSalve(Roman roman) {
        roman.setHealthPool(roman.getHealthPool() + 30);
    }
}
