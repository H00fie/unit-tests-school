package bm.app.battleTacticKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BattleTacticsTest {

    BattleTactics battleTactics;
    MacedonianArmy macedonianArmy;
    PersianArmy persianArmy;

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

    @Test
    void bactriansShouldBe4000InNumbers() {
        //given
        int bactrianNumbers = persianArmy.getArmyComposition().get("Bactrian Cavalry");
        //when
        battleTactics.countTheNumbersOfAUnitType();
        //then
    }

    @BeforeEach
    void setUp() {
        battleTactics = new BattleTactics();
        macedonianArmy = new MacedonianArmy();
        persianArmy = new PersianArmy();
    }

}