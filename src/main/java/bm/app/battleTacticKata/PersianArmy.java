package bm.app.battleTacticKata;

public class PersianArmy extends Army {

    public PersianArmy() {
        getArmyComposition().put("Spearmen", 25000);
        getArmyComposition().put("Immortals", 10000);
        getArmyComposition().put("Archers", 15000);
        getArmyComposition().put("Mounted Archers", 6000);
        getArmyComposition().put("Bactrian Cavalry", 4000);
    }

}
