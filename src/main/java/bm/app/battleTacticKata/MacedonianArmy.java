package bm.app.battleTacticKata;

public class MacedonianArmy extends Army{

    public MacedonianArmy() {
        this.getArmyComposition().put("Phalangites", 16000);
        this.getArmyComposition().put("Cretan Archers", 2000);
        this.getArmyComposition().put("Agrianian Javelinmen", 1500);
        this.getArmyComposition().put("Greek Hoplites", 4000);
        this.getArmyComposition().put("Hetaiori", 1800);
    }
}
