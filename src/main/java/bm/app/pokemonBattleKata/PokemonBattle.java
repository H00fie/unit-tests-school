package bm.app.pokemonBattleKata;

import java.util.HashMap;
import java.util.Map;

public class PokemonBattle {

    private Map<Potion, Integer> potionStock = new HashMap<>();

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

    public void addPotionsToTheStock(String potionKind, int quantity) {
        switch (potionKind) {
            case "Weak":
                if (potionStock.containsKey(Potion.WEAK)) {
                    potionStock.put(Potion.WEAK, potionStock.get(Potion.WEAK) + quantity);
                } else {
                    potionStock.put(Potion.WEAK, quantity);
                }
                break;
            case "Regular":
                if (potionStock.containsKey(Potion.REGULAR)) {
                    potionStock.put(Potion.REGULAR, potionStock.get(Potion.REGULAR) + quantity);
                } else {
                    potionStock.put(Potion.REGULAR, quantity);
                }
                break;
            case "Super":
                if (potionStock.containsKey(Potion.SUPER)) {
                    potionStock.put(Potion.SUPER, potionStock.get(Potion.SUPER) + quantity);
                } else {
                    potionStock.put(Potion.SUPER, quantity);
                }
                break;
            case "Hyper":
                if (potionStock.containsKey(Potion.HYPER)) {
                    potionStock.put(Potion.HYPER, potionStock.get(Potion.HYPER) + quantity);
                } else {
                    potionStock.put(Potion.HYPER, quantity);
                }
                break;
        }
    }

    public Map<Potion, Integer> getPotionStock() {
        return potionStock;
    }

    public void usePotion(Pokemon targetToHeal) {
        targetToHeal.setHitPoints(targetToHeal.getHitPoints() + 50);
    }

}
