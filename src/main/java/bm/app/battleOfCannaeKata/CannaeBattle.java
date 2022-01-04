package bm.app.battleOfCannaeKata;

public class CannaeBattle {

    public void soundTheCharge(Carthaginian carthaginian) {
        if (!carthaginian.isCharging()) {
            carthaginian.setCharging(true);
        }
    }

}
