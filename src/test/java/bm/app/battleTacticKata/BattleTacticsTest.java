package bm.app.battleTacticKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTacticsTest {

    BattleTactics battleTactics;

    @Test
    void pikemenShouldHaveTheirFormationClosed() {
        //given
        boolean formationClosed = battleTactics.isFormationClosed();
        //when
        //then
    }

    @BeforeEach
    void setUp(){
        battleTactics = new BattleTactics();
    }

}