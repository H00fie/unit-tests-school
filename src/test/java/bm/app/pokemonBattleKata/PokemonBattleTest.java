package bm.app.pokemonBattleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class PokemonBattleTest {

    PokemonBattle pokemonBattle;
    ProtectiveShieldProvider protectiveShieldProvider;

    @Test
    @DisplayName("Should deal regular damage without taking into consideration type advantages or disadvantages.")
    void shouldDealRegularDamage() {
        //given
        Pokemon attacker = pokeballThrow("Bidoof", Type.NORMAL, 10, 50, 30, false);
        Pokemon defender = pokeballThrow("Haunter", Type.GHOST, 70, 300, 30, false);
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
        Pokemon attacker = pokeballThrow("Dragonite", Type.DRAGON, 250, 700, 30, false);
        Pokemon defender = pokeballThrow("Sylveon", Type.FAIRY, 100, 250, 30, false);
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
        Pokemon attacker = pokeballThrow("Cubone", Type.GROUND, 40, 150, 30, false);
        Pokemon defender = pokeballThrow("Onix", Type.ROCK, 80, 550, 30, false);
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
        Pokemon attacker = pokeballThrow("Tepig", Type.FIRE, 30, 100, 30, false);
        Pokemon defender = pokeballThrow("Bulbasaur", Type.GRASS, 25, 110, 30, false);
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
        Pokemon attacker = pokeballThrow("Charmander", Type.FIRE, 30, 90, 30, false);
        Pokemon defender = pokeballThrow("Glaceon", Type.ICE, 80, 260, 30, false);
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
        Pokemon cubone = pokeballThrow("Cubone", Type.GROUND, 40, 150, 14, false);
        Pokemon espeon = pokeballThrow("Espeon", Type.PSYCHIC, 90, 340, 26, false);
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
        Pokemon pikachu = pokeballThrow("Pikachu", Type.ELECTRIC, 25, 130, 10, false);
        Pokemon metapod = pokeballThrow("Metapod", Type.BUG, 10, 200, 10, false);
        //when
        for (int i = 0; i < 8; i++) {
            pokemonBattle.dealDamage(pikachu, metapod);
        }
        pokemonBattle.levelUpIfStrongerEnemyDefeated(pikachu, metapod);
        //then
        assertThat(pikachu.getLevel()).isEqualTo(10);
    }

    @Test
    @DisplayName("The flag responsible for indicating if the shield is active should be set to true.")
    void shouldActivateShield() {
        //given
        Pokemon gastly = pokeballThrow("Gastly", Type.GHOST, 50, 170, 20, false);
        //when
        pokemonBattle.activateShield(gastly);
        //then
        assertThat(gastly.isShield()).isEqualTo(true);
    }

    @Test
    @DisplayName("A shield should block incoming damage and the defender should not lose any hit points.")
    void protectiveShieldShouldBlockIncomingDamage() {
        //given
        Pokemon larvitar = pokeballThrow("Larvitar", Type.DRAGON, 30, 90, 9, false);
        Pokemon poochyena = pokeballThrow("Poochyena", Type.DARK, 35, 80, 7, false);
        //when
        pokemonBattle.activateShield(poochyena);
        Mockito.when(protectiveShieldProvider.getDefaultShield()).thenReturn(250.0);
        pokemonBattle.dealDamageWithDefaultShieldIncluded(larvitar, poochyena);
        //then
        assertThat(poochyena.getHitPoints()).isEqualTo(300.0);
    }

    @Test
    void protectiveShieldShouldBlockIncomingDamageBoostedBy80() {
        //given
        Pokemon scyther = pokeballThrow("Scyther", Type.BUG, 80, 310, 25, false);
        Pokemon rhyhorn = pokeballThrow("Rhyhorn", Type.GROUND, 75, 400, 30, false);
        //when
        pokemonBattle.activateShield(rhyhorn);
        Mockito.when(protectiveShieldProvider.getShieldWithABoost(BoostStone.RARE)).thenReturn(80.0);
        pokemonBattle.dealDamageWithShieldIncluded(scyther, rhyhorn, BoostStone.RARE);
        //then
        assertThat(rhyhorn.getHitPoints()).isEqualTo(400.0);
    }

    @Test
    @DisplayName("The defender should not be able to use a charged attack yet due to hit points not being low enough.")
    void shouldNotBeAbleToUseAChargedAttack() {
        //given
        Pokemon ariados = pokeballThrow("Ariados", Type.BUG, 70, 240, 20, false);
        Pokemon graveler = pokeballThrow("Graveler", Type.ROCK, 45, 450, 20, false);
        //when
        pokemonBattle.useChargedAttack(ariados, graveler);
        //then
        assertThat(graveler.getHitPoints()).isEqualTo(450);
    }

    private Pokemon pokeballThrow(String name, Type type, double power, double hitPoints, int level, boolean shield) {
        return new Pokemon(name, type, power, hitPoints, level, shield);
    }

    @BeforeEach
    void setUp() {
        protectiveShieldProvider = Mockito.mock(ProtectiveShieldProvider.class);
        pokemonBattle = new PokemonBattle(protectiveShieldProvider);
    }

}