package bm.app.battleTacticKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

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
        int expectedNumbers = 4000;
        String name = "Bactrian Cavalry";
        //when
        int actualNumbers = battleTactics.countTheNumbersOfAUnitType(persianArmy.getArmyComposition(), name);
        //then
        assertThat(actualNumbers).isEqualTo(expectedNumbers);
    }

    @Test
    void spearmenNumbersShouldDropBy3000AfterHetairoiCharge() {
        //given
        String unitAttackedByHetairoi = "Spearmen";
        int spearmenNumbersAfterCharge = 22000;
        Map<String, Integer> enemyArmy = persianArmy.getArmyComposition();
        //when
        battleTactics.chargeOfTheHetairoi(unitAttackedByHetairoi, enemyArmy);
        //then
        assertThat(persianArmy.getArmyComposition().get(unitAttackedByHetairoi)).isEqualTo(spearmenNumbersAfterCharge);
    }

    @Test
    void immortalsShouldBlockIncomingDamage() {
        //given
        String name = "Immortals";
        //when
        battleTactics.shieldsUpAndBraceForImpact();
        //then
    }

    @BeforeEach
    void setUp() {
        battleTactics = new BattleTactics();
        macedonianArmy = new MacedonianArmy();
        persianArmy = new PersianArmy();
    }

}