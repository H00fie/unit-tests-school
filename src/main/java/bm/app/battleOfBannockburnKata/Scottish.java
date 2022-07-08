package bm.app.battleOfBannockburnKata;

public enum Scottish {

    PIKEMEN("Pikemen", 600, 30, 200, ArmourType.LEATHER, 10, false, true),
    KNIGHTS("Knights", 1000, 100,40, ArmourType.HALF_PLATE, 80, false, true);

    private String name;
    private int healthPool;
    private int power;
    private int number;
    private ArmourType armourType;
    private int speed;
    private boolean isInFormation;
    private boolean isAlive;

    Scottish(String name, int healthPool, int power, int number, ArmourType armourType, int speed, boolean isInFormation, boolean isAlive) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.number = number;
        this.armourType = armourType;
        this.speed = speed;
        this.isInFormation = isInFormation;
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

    public ArmourType getArmourType() {
        return armourType;
    }

    public void setArmourType(ArmourType armourType) {
        this.armourType = armourType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isInFormation() {
        return isInFormation;
    }

    public void setInFormation(boolean inFormation) {
        isInFormation = inFormation;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
