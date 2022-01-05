package bm.app.battleOfCannaeKata;

public enum Roman {

    HASTATI("Hastati", 200, 100, 160, 80, 50, false),
    PRINCIPES("Principes", 280, 150, 160, 150, 40, false),
    TRIARII("Triarii", 320, 160, 100, 250, 40, false);

    private String name;
    private int healthPool;
    private int power;
    private int number;
    private int defence;
    private int speed;
    private boolean isCharging;

    Roman(String name, int healthPool, int power, int number, int defence, int speed, boolean isCharging) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.number = number;
        this.defence = defence;
        this.speed = speed;
        this.isCharging = isCharging;
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
}
