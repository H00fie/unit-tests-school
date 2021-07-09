package bm.app.pokemonBattleKata;

public interface ProtectiveShieldProvider {

    double getDefaultShield();
    double getShieldWithABoost(BoostStone boostStone);
}
