package bm.app.shooter;

public enum Enemy {

    PEASANT(7, 80, Courage.COWARDLY, false, 12),
    MAN_AT_ARMS(15, 130, Courage.STERN, false, 10),
    BANDIT(13, 120, Courage.MODERATE, false, 10),
    MERCENARY(18, 150, Courage.BRAVE, true, 9),
    PIKEMAN(19, 150, Courage.BRAVE, true, 7),
    KNIGHT(30, 200, Courage.FEARLESS, true, 20);

    private int power;
    private int health;
    private Courage courage;
    private boolean ifArmoured;
    private int speed;

    Enemy(int power, int health, Courage courage, boolean ifArmoured, int speed) {
        this.power = power;
        this.health = health;
        this.courage = courage;
        this.ifArmoured = ifArmoured;
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public Courage getCourage() {
        return courage;
    }

    public boolean ifArmoured() {
        return ifArmoured;
    }

    public int getSpeed() {
        return speed;
    }
}
