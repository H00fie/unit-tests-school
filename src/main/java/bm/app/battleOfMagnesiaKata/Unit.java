package bm.app.battleOfMagnesiaKata;

public enum Unit {

    PHALANGITES(256, Weapon.SARISSA, Armour.HEAVY, false, false),
//    HYPASPISTS(),
//    IMMORTALS(),
//    EASTERN_ARCHERS(),
//    PELTASTS(),
    THORAKITAI(160, Weapon.SWORD, Armour.HEAVY, false, false);
//    PRODROMOI(),
//    MEDES(),
//    HETAIROI(),
//    CATAPHRACTII(),
//    BACTRIANS(),
//    SCYTHED_CHARIOTS(),
//    WAR_ELEPHANTS();

    private int numbers;
    private Weapon weapon;
    private Armour armour;
    private boolean ifMounted;
    private boolean tactic;

    Unit(int numbers, Weapon weapon, Armour armour, boolean ifMounted, boolean tactic) {
        this.numbers = numbers;
        this.weapon = weapon;
        this.armour = armour;
        this.ifMounted = ifMounted;
        this.tactic = tactic;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public boolean isIfMounted() {
        return ifMounted;
    }

    public void setIfMounted(boolean ifMounted) {
        this.ifMounted = ifMounted;
    }

    public boolean isTactic() {
        return tactic;
    }

    public void setTactic(boolean tactic) {
        this.tactic = tactic;
    }
}
