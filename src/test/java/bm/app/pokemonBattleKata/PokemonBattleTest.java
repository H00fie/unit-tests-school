package bm.app.pokemonBattleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonBattleTest {

    PokemonBattle pokemonBattle;

    @Test
    void shouldDealRegularDamage() {
        //given
        //when
        int damageDealt = pokemonBattle.dealDamage();
        //then
    }

    @BeforeEach
    void setUp() {
        pokemonBattle = new PokemonBattle();
    }

}