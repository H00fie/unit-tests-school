package bm.app.pokemonBattleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class PokemonBattleTest {

    PokemonBattle pokemonBattle;

    @Test
    void shouldDealRegularDamage() {
        //given
        Pokemon attacker = pokeballThrow("Bidoof", Type.NORMAL, 10, 50, 30);
        Pokemon defender = pokeballThrow("Haunter", Type.GHOST, 70, 300, 30);
        //when
        double expectedDefendersHp = pokemonBattle.dealDamageIgnoringTypes(attacker, defender);
        double actualDefendersHp = 290.0;
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @Test
    void shouldReduceDamageByHalf() {
        //given
        Pokemon attacker = pokeballThrow("Sylveon", Type.FAIRY, 100, 250, 30);
        Pokemon defender = pokeballThrow("Dragonite", Type.DRAGON, 250, 700, 30);
        //when
        pokemonBattle.dealDamage(attacker, defender);
        double expectedDefendersHp = 500.0;
        double actualDefendersHp = defender.getHitPoints();
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @Test
    void shouldIncreaseDamageTwice() {
        //given
        Pokemon attacker = pokeballThrow("Cubone", Type.EARTH, 40, 150, 30);
        Pokemon defender = pokeballThrow("Onix", Type.ROCK, 80, 550, 30);
        //when
        pokemonBattle.dealDamage(attacker, defender);
        double expectedDefendersHp = 470.0;
        double actualDefendersHp = defender.getHitPoints();
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @Test
    void shouldRestorePokemonsHpByUsingPotion() {
        //given
        Pokemon attacker = pokeballThrow("Tepig", Type.FIRE, 30, 100, 30);
        Pokemon defender = pokeballThrow("Bulbasaur", Type.GRASS, 25, 110, 30);
        //when
        pokemonBattle.dealDamage(attacker, defender);
        pokemonBattle.usePotionSimply(defender);
        double expectedDefendersHp = 100.0;
        //then
        assertThat(defender.getHitPoints()).isEqualTo(expectedDefendersHp);
    }

    @Test
    void shouldAddThreeWeakPotionsToTheStock() {
        //given
        String potionKind = "Weak";
        int quantity = 3;
        //when
        pokemonBattle.addPotionsToTheStock(potionKind, quantity);
        //then
        assertThat(pokemonBattle.getPotionStock().get(Potion.WEAK)).isEqualTo(quantity);
    }

    @Test
    void shouldThrowPotionsOutOfStockExceptionWhenTheRequestedAmountIsNotAvailable() throws PotionsOutOfStockException {
        //given
        Pokemon attacker = pokeballThrow("Charmander", Type.FIRE, 30, 90, 30);
        Pokemon defender = pokeballThrow("Glaceon", Type.ICE, 80, 260, 30);
        Potion potionKind = Potion.REGULAR;
        int quantity = 4;
        //when
        pokemonBattle.addPotionsToTheStock("Regular", 2);
        pokemonBattle.dealDamage(attacker, defender);
        //then
        assertThatExceptionOfType(PotionsOutOfStockException.class).isThrownBy(() -> {
            pokemonBattle.usePotion(potionKind, quantity, defender);
        }).withMessage("Potions not available!");
    }

    @Test
    void pokemonShouldLevelUpAfterDefeatingTheOpponent() {
        //given
        Pokemon cubone = pokeballThrow("Cubone", Type.EARTH, 40, 150, 14);
        Pokemon espeon = pokeballThrow("Espeon", Type.PSYCHIC, 90, 340, 26);
        //when
        for(int i = 0; i < 9; i++) {
            pokemonBattle.dealDamage(cubone, espeon);
        }
        pokemonBattle.levelUpIfStrongerEnemyDefeated();
        //then
    }

    private Pokemon pokeballThrow(String name, Type type, double power, double hitPoints, int level) {
        return new Pokemon(name, type, power, hitPoints, level);
    }

    @BeforeEach
    void setUp() {
        pokemonBattle = new PokemonBattle();
    }

}