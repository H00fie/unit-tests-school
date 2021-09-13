package bm.app.dragoonFight;

public class Dragoon {

    private int health;
    private int power;
    private int speed;
    private String armourType;

    public Dragoon(int health, int power, int speed, String armourType) {
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.armourType = armourType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }
}
