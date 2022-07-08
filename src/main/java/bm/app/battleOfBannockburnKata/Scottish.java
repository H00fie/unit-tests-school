package bm.app.battleOfBannockburnKata;

public enum Scottish {

    PIKEMEN("Pikemen", 600, 30, 200, ArmourType.LEATHER, 10, false);

    private String name;
    private int healthPool;
    private int power;
    private int number;
    private ArmourType armourType;
    private int speed;
    private boolean isInFormation;

    Scottish(String name, int healthPool, int power, int number, ArmourType armourType, int speed, boolean isInFormation) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.number = number;
        this.armourType = armourType;
        this.speed = speed;
        this.isInFormation = isInFormation;
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
}
