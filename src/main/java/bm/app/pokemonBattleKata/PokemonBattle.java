package bm.app.pokemonBattleKata;

public class PokemonBattle {

    public double dealDamageIgnoringTypes(Pokemon attacker, Pokemon defender) {
        return defender.getHitPoints() - attacker.getPower();
    }

    public void dealDamage(Pokemon attacker, Pokemon defender) {
        if (attacker.getType().getStrengths().contains(defender.getType().getName())) {
            defender.setHitPoints(defender.getHitPoints() - (attacker.getPower() * 2));
        } else if (attacker.getType().getWeaknesses().contains(defender.getType().getName())) {
            defender.setHitPoints(defender.getHitPoints() - (attacker.getPower() / 2));
        } else {
            defender.setHitPoints(defender.getHitPoints() - attacker.getPower());
        }
    }





}
