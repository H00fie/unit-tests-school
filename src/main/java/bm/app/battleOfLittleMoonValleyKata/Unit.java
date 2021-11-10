package bm.app.battleOfLittleMoonValleyKata;

public enum Unit {

    CROSSBOWMEN("Crossbowmen", 180, 300, 120, Armour.MAIL, Weapon.CROSSBOW),
    PIKEMEN("Pikemen", 400, 100, 256, Armour.PLATE, Weapon.PIKE);

    private String name;
    private int healthPool;
    private int power;
    private int numbers;
    private Armour armour;
    private Weapon weapon;

    Unit(String name, int healthPool, int power, int numbers, Armour armour, Weapon weapon) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.numbers = numbers;
        this.armour = armour;
        this.weapon = weapon;
    }
}
