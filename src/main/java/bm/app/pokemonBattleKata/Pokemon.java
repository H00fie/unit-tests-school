package bm.app.pokemonBattleKata;

public class Pokemon {

    private String name;
    private Type type;
    private double power;
    private double hitPoints;
    private int level;

    public Pokemon(String name, Type type, double power, double hitPoints, int level) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.hitPoints = hitPoints;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }
}
