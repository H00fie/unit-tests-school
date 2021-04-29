package bm.app.battleTacticKata;

public class PersianArmy extends Army {

    public PersianArmy() {
        this.getArmyComposition().put("Spearmen", 25000);
        this.getArmyComposition().put("Immortals", 10000);
        this.getArmyComposition().put("Archers", 15000);
        this.getArmyComposition().put("Mounted Archers", 6000);
        this.getArmyComposition().put("Bactrian Cavalry", 4000);
    }
}
