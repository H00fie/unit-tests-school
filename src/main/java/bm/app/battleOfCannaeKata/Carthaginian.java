package bm.app.battleOfCannaeKata;

public enum Carthaginian {

    IBERIAN_SWOWRDSMEN("Iberian Swordsmen", 200, 100, 160, 80, 50, false, true),
    NUMIDIAN_MOUNTED_JAVELINMEN("Numidian Mounted Javelinmen", 100, 160, 80, 20, 250, false, true),
    GALLIC_NOBLE_CAVALRY("Gallic Noble Cavalry", 300, 250, 40, 250, 150, false, true),
    CARTHAGINIAN_NOBLES("Carthaginian Nobles", 350, 300, 30, 350, 120, false, true),
    LIBIAN_SPEARMEN("Libian Spearmen", 230, 80, 180, 120, 50, false, true),
    BALEARIC_SLINGERS("Balearic Slingers", 80, 150, 140, 40, 75, false, true);

    private String name;
    private int healthPool;
    private int power;
    private int number;
    private int defence;
    private int speed;
    private boolean isCharging;
    private boolean isAlive;

    Carthaginian(String name, int healthPool, int power, int number, int defence, int speed, boolean isCharging, boolean isAlive) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.number = number;
        this.defence = defence;
        this.speed = speed;
        this.isCharging = isCharging;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public void setHealthPool(int healthPool) {
        this.healthPool = healthPool;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
