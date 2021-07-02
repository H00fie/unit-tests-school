package bm.app.pokemonBattleKata;

public enum Potion {
    WEAK("Weak", 10),
    REGULAR("Regular", 40),
    SUPER("Super", 80),
    HYPER("Hyper", 140);

    private String name;
    private int healingPower;

    Potion(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }
}
