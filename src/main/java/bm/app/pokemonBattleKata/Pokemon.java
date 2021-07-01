package bm.app.pokemonBattleKata;

public class Pokemon {

    String name;
    Type type;
    int power;
    double hitPoints;

    public Pokemon(String name, Type type, int power, double hitPoints) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.hitPoints = hitPoints;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }
}
