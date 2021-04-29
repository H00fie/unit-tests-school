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
        String unitName = "Immortals";
        int incomingDamageOutput = 500;
        Map<String, Integer> army = persianArmy.getArmyComposition();
        //when
        battleTactics.shieldsUpAndBraceForImpact(incomingDamageOutput, unitName, army);
        //then
        assertThat(army.get(unitName)).isEqualTo(10000);
    }

    @Test
    void cretansShouldReceiveFullDamage() {
        //given
        String unitName = "Cretan Archers";
        int incomingDamageOutput = 175;
        Map<String, Integer> army = macedonianArmy.getArmyComposition();
        //when
        battleTactics.shieldsUpAndBraceForImpact(incomingDamageOutput, unitName, army);
        //then
        assertThat(army.get(unitName)).isEqualTo(1825);
    }

    @Test
    void phalangitesShouldReceiveReducedDamage() {
        //given
        String unitName = "Phalangites";
        int incomingDamageOutput = 1000;
        Map<String, Integer> army = macedonianArmy.getArmyComposition();
        //when
        battleTactics.shieldsUpAndBraceForImpact(incomingDamageOutput, unitName, army);
        //then
        assertThat(army.get(unitName)).isEqualTo(15500);
    }

    @BeforeEach
    void setUp() {
        battleTactics = new BattleTactics();
        macedonianArmy = new MacedonianArmy();
        persianArmy = new PersianArmy();
    }

}