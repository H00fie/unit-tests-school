package bm.app.forgeKata;

public enum Weapon {

    SWORD("Sword", Range.SHORT),
    AXE("Axe", Range.SHORT),
    HAMMER("Hammer", Range.SHORT),
    SPEAR("Spear", Range.MEDIUM),
    CROSSBOW("Crossbow", Range.LONG),
    BOW("Bow", Range.LONG);

    private String name;
    private Range range;

    Weapon(String name, Range range) {
        this.name = name;
        this.range = range;
    }
}
