package bm.app.battleOfLittleMoonValleyKata;

public enum Unit {

    CROSSBOWMEN("Crossbowmen", 180, 300, 120, Armour.MAIL, Weapon.CROSSBOW),
    PIKEMEN("Pikemen", 400, 100, 256, Armour.PLATE, Weapon.PIKE),
    SLAYERS("Slayers", 150, 300, 80, Armour.NONE, Weapon.AXE),
    THUNDERERS("Thunderers", 180, 400, 80, Armour.MAIL, Weapon.HANDGUN),
    SHIELD_BEARERS("Shield bearers", 600, 60, 250, Armour.PLATE, Weapon.SWORD),
    OATHKEEPERS("Oathleepers", 500, 350, 50, Armour.MITHRIL, Weapon.AXE),
    ROCK_HANDS("Rock hands", 300, 240, 200, Armour.MAIL, Weapon.AXE);

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

    public String getName() {
        return name;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public int getPower() {
        return power;
    }

    public int getNumbers() {
        return numbers;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
