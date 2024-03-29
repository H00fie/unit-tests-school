package bm.app.dragoonFight;

public class Dragon {

    private String name;
    private int health;
    private int physicalPower;
    private int magicalPower;
    private String dragonType;

    public Dragon(String name, int health, int physicalPower, int magicalPower, String dragonType) {
        this.name = name;
        this.health = health;
        this.physicalPower = physicalPower;
        this.magicalPower = magicalPower;
        this.dragonType = dragonType;
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

    public int getPhysicalPower() {
        return physicalPower;
    }

    public void setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public String getDragonType() {
        return dragonType;
    }

    public void setDragonType(String dragonType) {
        this.dragonType = dragonType;
    }
}
