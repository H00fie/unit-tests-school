package bm.app.shooter;

public enum Weapon {

    BOW("Bow", 45, 120, ReloadPace.FAST, Cost.CHEAP),
    CROSSBOW("Crossbow", 65, 110, ReloadPace.SLOW, Cost.EXPENSIVE),
    HEAVY_CROSSBOW("Heavy crossbow", 100, 130, ReloadPace.VERY_SLOW, Cost.VERY_EXPENSIVE),
    ARBALEST("Arbalest", 120, 150, ReloadPace.AVERAGE, Cost.INCREDIBLY_EXPENSIVE);

    private String name;
    private int power;
    private int range;
    private ReloadPace reloadPace;
    private Cost cost;

    Weapon(String name, int power, int range, ReloadPace reloadPace, Cost cost) {
        this.name = name;
        this.power = power;
        this.range = range;
        this.reloadPace = reloadPace;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getRange() {
        return range;
    }

    public ReloadPace getReloadPace() {
        return reloadPace;
    }

    public Cost getCost() {
        return cost;
    }
}
