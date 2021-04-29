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
    void hetairoiShouldNotBeReady() {
        //given
        boolean ifHornsBlown = false;
        //when
        boolean areHetairoiReady = battleTactics.areHetairoiOnTheFlank(ifHornsBlown);
        //then
        assertThat(areHetairoiReady).isFalse();
    }

    @BeforeEach
    void setUp(){
        battleTactics = new BattleTactics();
    }

}