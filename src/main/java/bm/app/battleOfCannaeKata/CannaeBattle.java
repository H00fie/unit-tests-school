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
}
