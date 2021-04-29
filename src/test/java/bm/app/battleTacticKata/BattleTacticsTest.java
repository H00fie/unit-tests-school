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
        //when
        boolean formationClosed = battleTactics.isFormationClosed(ifArchersFormedUp);
        //then
        assertThat(formationClosed).isEqualTo(true);
    }

    @Test
    void hetairoiShouldBeReady() {
        //given
        //when
        boolean areHetairoiReady = battleTactics.areHetairoiOnTheFlank();
        //then
    }

    @BeforeEach
    void setUp(){
        battleTactics = new BattleTactics();
    }

}