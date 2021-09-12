package bm.app.dragoonFight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuelTest {

    Duel duel;

    @Test
    void shouldDealDamage() {
        //given
        int damage = 100;
        //when
        duel.performSpineshatteringJump();
        //then
    }

    @BeforeEach
    void setUp() {
        duel = new Duel();
    }

}