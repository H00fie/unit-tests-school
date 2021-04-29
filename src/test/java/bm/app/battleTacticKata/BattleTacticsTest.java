package bm.app.battleTacticKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BattleTacticsTest {

    BattleTactics battleTactics;

    @Test
    void pikemenShouldHaveTheirFormationClosed() {
        //given
        boolean ifArchersFormedUp = true;
        boolean formationClosed = battleTactics.isFormationClosed(ifArchersFormedUp);
        //then
        assertThat(formationClosed).isEqualTo(true);
    }

    @BeforeEach
    void setUp(){
        battleTactics = new BattleTactics();
    }

}