package bm.app.pokemonBattleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class PokemonBattleTest {

    PokemonBattle pokemonBattle;
    ProtectiveShieldProvider protectiveShieldProvider;

    @Test
    @DisplayName("Should deal regular damage without taking into consideration type advantages or disadvantages.")
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
    @DisplayName("The damage dealt by the attacker should be cut in half due to the type disadvantage.")
    void shouldReduceDamageByHalf() {
        //given
        Pokemon attacker = pokeballThrow("Dragonite", Type.DRAGON, 250, 700, 30);
        Pokemon defender = pokeballThrow("Sylveon", Type.FAIRY, 100, 250, 30);
        //when
        pokemonBattle.dealDamage(attacker, defender);
        double expectedDefendersHp = 125.0;
        double actualDefendersHp = defender.getHitPoints();
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @Test
    @DisplayName("The damage dealt by the attacker shold be doubled due to the type advantage.")
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
    @DisplayName("The pokemon's hit points should be restored due to the usage of the potion.")
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
    @DisplayName("Three weak potions should be added to the stock.")
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
    @DisplayName("Should throw PotionsOutOfStockException when the requested amount is currently not available.")
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
    @DisplayName("Pokemon should level up because they defeat a stronger opponent.")
    void pokemonShouldLevelUpAfterDefeatingTheOpponent() {
        //given
        Pokemon cubone = pokeballThrow("Cubone", Type.EARTH, 40, 150, 14);
        Pokemon espeon = pokeballThrow("Espeon", Type.PSYCHIC, 90, 340, 26);
        //when
        for(int i = 0; i < 9; i++) {
            pokemonBattle.dealDamage(cubone, espeon);
        }
        pokemonBattle.levelUpIfStrongerEnemyDefeated(cubone, espeon);
        //then
        assertThat(cubone.getLevel()).isEqualTo(15);
    }

    @Test
    @DisplayName("Pokemon does not level up because the enemy's level is not higher.")
    void pokemoneShouldNotLeveUpAfterDefeatingTheOpponentDueToTheFoeNotBeingStronger() {
        //given
        Pokemon pikachu = pokeballThrow("Pikachu", Type.ELECTRIC, 25, 130, 10);
        Pokemon metapod = pokeballThrow("Metapod", Type.BUG, 10, 200, 10);
        //when
        for (int i = 0; i < 8; i++) {
            pokemonBattle.dealDamage(pikachu, metapod);
        }
        pokemonBattle.levelUpIfStrongerEnemyDefeated(pikachu, metapod);
        //then
        assertThat(pikachu.getLevel()).isEqualTo(10);
    }

    @Test
    @DisplayName("A shield should block incoming damage and the defender should not lose any hit points.")
    void protectiveShieldShouldBlockIncomingDamage() {
        //given
        Pokemon larvitar = pokeballThrow("Larvitar", Type.DRAGON, 30, 90, 9);
        Pokemon poochyena = pokeballThrow("Poochyena", Type.DARK, 35, 80, 7);
        //when
        pokemonBattle.activateShield();
        //then

    }

    private Pokemon pokeballThrow(String name, Type type, double power, double hitPoints, int level) {
        return new Pokemon(name, type, power, hitPoints, level);
    }

    @BeforeEach
    void setUp() {
        protectiveShieldProvider = Mockito.mock(ProtectiveShieldProvider.class);
        pokemonBattle = new PokemonBattle(protectiveShieldProvider);
    }

}