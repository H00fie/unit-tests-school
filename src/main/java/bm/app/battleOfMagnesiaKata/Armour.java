package bm.app.battleOfMagnesiaKata;

public enum Armour {

    NO_ARMOUR(0),
    LIGHT(10),
    MEDIUM(20),
    HEAVY(40);

    private int defense;

    Armour(int defense) {
        this.defense = defense;
    }
}
