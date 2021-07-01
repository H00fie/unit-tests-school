package bm.app.pokemonBattleKata;

public class PokemonBattle {

    public double dealDamageIgnoringTypes(Pokemon attacker, Pokemon defender) {
        return defender.getHitPoints() - attacker.getPower();
    }

}
