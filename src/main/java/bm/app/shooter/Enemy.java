package bm.app.shooter;

public enum Enemy {

    PEASANT(7, Courage.COWARDLY, false, 12),
    MAN_AT_ARMS(15, Courage.STERN, false, 10),
    BANDIT(13, Courage.MODERATE, false, 10),
    MERCENARY(18, Courage.BRAVE, true, 9),
    PIKEMAN(19, Courage.BRAVE, true, 7),
    KNIGHT(30, Courage.FEARLESS, true, 20);

    private int power;
    private Courage courage;
    private boolean ifArmoured;
    private int speed;

    Enemy(int power, Courage courage, boolean ifArmoured, int speed) {
        this.power = power;
        this.courage = courage;
        this.ifArmoured = ifArmoured;
        this.speed = speed;
    }

    public int getPower() {
        return power;
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
