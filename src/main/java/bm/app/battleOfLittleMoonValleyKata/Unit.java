package bm.app.battleOfLittleMoonValleyKata;

public enum Unit {

    CROSSBOWMEN("Crossbowmen", 180, 300, 120),
    PIKEMEN("Pikemen", 400, 100, 256);

    private String name;
    private int healthPool;
    private int power;
    private int numbers;

    Unit(String name, int healthPool, int power, int numbers) {
        this.name = name;
        this.healthPool = healthPool;
        this.power = power;
        this.numbers = numbers;
    }
}
