package bm.app.battleOfMagnesiaKata;

public enum Weapon {

    SARISSA(35, 50),
    XYSTON(25, 35),
    DORU(20, 35),
    JAVELIN(70, 50),
    BOW(150, 40),
    SWORD(10, 40),
    AXE(10, 40),
    SELF(5, 200);

    private int range;
    private int power;

    Weapon(int range, int power) {
        this.range = range;
        this.power = power;
    }
}
