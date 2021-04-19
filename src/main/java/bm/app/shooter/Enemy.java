package bm.app.shooter;

public enum Enemy {

    PEASANT(7, 80, Courage.COWARDLY, false, 12, false),
    MAN_AT_ARMS(15, 130, Courage.STERN, false, 10, false),
    BANDIT(13, 120, Courage.MODERATE, false, 10, false),
    MERCENARY(18, 150, Courage.BRAVE, true, 9, false),
    PIKEMAN(19, 150, Courage.BRAVE, true, 7, false),
    KNIGHT(30, 200, Courage.FEARLESS, true, 20, false);

    private int power;
    private int health;
    private Courage courage;
    private boolean ifArmoured;
    private int speed;
    private boolean isMagicalShieldActive;

    Enemy(int power, int health, Courage courage, boolean ifArmoured, int speed, boolean isMagicalShieldActive) {
        this.power = power;
        this.health = health;
        this.courage = courage;
        this.ifArmoured = ifArmoured;
        this.speed = speed;
        this.isMagicalShieldActive = isMagicalShieldActive;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Courage getCourage() {
        return courage;
    }

    public void setCourage(Courage courage) {
        this.courage = courage;
    }

    public boolean ifArmoured() {
        return ifArmoured;
    }

    public void setIfArmoured(boolean ifArmoured) {
        this.ifArmoured = ifArmoured;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isMagicalShieldActive() {
        return isMagicalShieldActive;
    }

    public void setMagicalShieldActive(boolean magicalShieldActive) {
        isMagicalShieldActive = magicalShieldActive;
    }
}
