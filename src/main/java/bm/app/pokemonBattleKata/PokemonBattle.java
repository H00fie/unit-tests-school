package bm.app.pokemonBattleKata;

public class PokemonBattle {

    public double dealDamageIgnoringTypes(Pokemon attacker, Pokemon defender) {
        return defender.getHitPoints() - attacker.getPower();
    }

    public double dealDamage(Pokemon attacker, Pokemon defender) {
        if (attacker.getType().getStrengths().contains(defender.getType().getName())) {
            return defender.getHitPoints() - (attacker.getPower() * 2);
        } else if (attacker.getType().getWeaknesses().contains(defender.getType().getName())) {
            return defender.getHitPoints() - (attacker.getPower() / 2);
        } else {
            return defender.getHitPoints() - attacker.getPower();
        }
    }





}
