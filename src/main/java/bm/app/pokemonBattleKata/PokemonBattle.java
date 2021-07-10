package bm.app.pokemonBattleKata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class PokemonBattle {

    private static final Logger logger = LoggerFactory.getLogger(PokemonBattle.class);

    private ProtectiveShieldProvider shield;

    public PokemonBattle(ProtectiveShieldProvider shield) {
        this.shield = shield;
    }

    private Map<Potion, Integer> potionStock = new HashMap<>();

    public void dealDamageWithShieldIncluded(Pokemon attacker, Pokemon defender, BoostStone stone) {
        if (defender.isShield()) {
            defender.setHitPoints(defender.getHitPoints() + this.shield.getShieldWithABoost(stone));
        }
        dealDamage(attacker, defender);
    }

    public void dealDamageWithDefaultShieldIncluded (Pokemon attacker, Pokemon defender) {
        if (defender.isShield()) {
            defender.setHitPoints(defender.getHitPoints() + this.shield.getDefaultShield());
        }
       dealDamage(attacker, defender);
    }

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

    public void levelUpIfStrongerEnemyDefeated(Pokemon attacker, Pokemon defender) {
        if (attacker.getLevel() < defender.getLevel()) {
            if (defender.getHitPoints() <= 0) {
                attacker.setLevel(attacker.getLevel() + 1);
                logger.info(attacker.getName() + " has defeated " + defender.getName() + ", a stronger foe and leveled up!");
            } else {
                logger.info(defender.getName() + " did not faint and can continue battling!");
            }
        } else {
            logger.info(attacker.getName() + "'s level is not higher than the " + defender.getName() + ". The conditions for a level up do not apply.");
        }
    }

    public Map<Potion, Integer> getPotionStock() {
        return potionStock;
    }

    public void usePotionSimply(Pokemon targetToHeal) {
        targetToHeal.setHitPoints(targetToHeal.getHitPoints() + 50);
    }

    public void usePotion(Potion potionKind, int quantity, Pokemon pokemon) throws PotionsOutOfStockException {
        if (potionStock.containsKey(potionKind)) {
            if (quantity <= potionStock.get(potionKind)) {
                pokemon.setHitPoints(pokemon.getHitPoints() + (potionKind.getHealingPower() * quantity));
                int currentNumberOfPotions = potionStock.get(potionKind);
                potionStock.put(potionKind, currentNumberOfPotions - quantity);
            } else {
                throw new PotionsOutOfStockException("Potions not available!");
            }
        } else {
            throw new PotionsOutOfStockException("Potions not available!");
        }
    }

    public void useChargedAttack(Pokemon attacker, Pokemon defender) {
        if (attacker.getHitPoints() < 100) {
            if (attacker.getType().getStrengths().contains(defender.getType().getName())) {
                defender.setHitPoints(defender.getHitPoints() - (attacker.getPower() * 4));
            } else if (attacker.getType().getWeaknesses().contains(defender.getType().getName())) {
                defender.setHitPoints(defender.getHitPoints() - (attacker.getPower() * 2));
            } else {
                defender.setHitPoints(defender.getHitPoints() - (attacker.getPower() * 2));
            }
        } else {
            logger.info(attacker.getName() + " cannot perform a charged attack because they have too much health left!");
        }
    }

    public boolean checkIfFainted(Pokemon pokemon) {
        if (pokemon.getHitPoints() <= 0) {
            pokemon.setHitPoints(0);
            return true;
        } else {
            return false;
        }
    }

    public void activateShield(Pokemon pokemon) {
        pokemon.setShield(true);
    }
}
