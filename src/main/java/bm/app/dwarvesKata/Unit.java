package bm.app.dwarvesKata;

public enum Unit {

    IRON_BREAKER("Iron braker", 100, 60),
    HAMMERER("Hammerer", 70, 90),
    THUNDERER("Thunderer", 40, 120),
    BOAR_RIDER("Boar rider", 80, 100),
    CANNON("Cannon", 10, 300);

    private String name;
    private int health;
    private int power;

    Unit(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
