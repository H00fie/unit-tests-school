package bm.app.battleOfLittleMoonValleyKata;

public enum Foe {

    GOBLIN("Goblin", 80, 50, 300, Armour.NONE, Weapon.SPEAR),
    TROLL("Troll", 500, 600, 3, Armour.NONE, Weapon.MACE);


    private String name;
    private int healthPool;
    private int power;
    private int number;
    private Armour armour;
    private Weapon weapon;

    Foe(String name, int healthPool, int power, int number, Armour armour, Weapon weapon) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
