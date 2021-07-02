package bm.app.pokemonBattleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonBattleTest {

    PokemonBattle pokemonBattle;

    @Test
    void shouldDealRegularDamage() {
        //given
        Pokemon attacker = new Pokemon("Bidoof", Type.NORMAL, 10, 50);
        Pokemon defender = new Pokemon("Haunter", Type.GHOST, 70, 300);
        //when
        double expectedDefendersHp = pokemonBattle.dealDamageIgnoringTypes(attacker, defender);
        double actualDefendersHp = 290.0;
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @Test
    void shouldReduceDamageByHalf() {
        //given
        Pokemon attacker = new Pokemon("Sylveon", Type.FAIRY, 100, 250);
        Pokemon defender = new Pokemon("Dragonite", Type.DRAGON, 250, 700);
        //when
        double expectedDefendersHp = 500.0;
        double actualDefendersHp = pokemonBattle.dealDamage(attacker, defender);
        //then
        assertThat(expectedDefendersHp).isEqualTo(actualDefendersHp);
    }

    @BeforeEach
    void setUp() {
        pokemonBattle = new PokemonBattle();
    }

}