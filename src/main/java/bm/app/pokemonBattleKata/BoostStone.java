package bm.app.pokemonBattleKata;

public enum BoostStone {
    COMMON(30),
    RARE(80),
    UNPARALLELED(150),
    LEGENDARY(300);

    private int power;

    BoostStone(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
