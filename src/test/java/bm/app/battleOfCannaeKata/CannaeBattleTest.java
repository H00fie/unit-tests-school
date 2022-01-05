package bm.app.battleOfCannaeKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class CannaeBattleTest {

    CannaeBattle cannaeBattle;

    @Test
    void numidianCavalryShouldCharge() {
        //given
        Carthaginian numidians = Carthaginian.NUMIDIAN_MOUNTED_JAVELINMEN;
        //when
        cannaeBattle.soundTheCharge(numidians);
        //then
        assertThat(numidians.isCharging()).isTrue();
    }

    @Test
    void volleyShouldDeal150Damage() {
        //given
        Carthaginian slingers = Carthaginian.BALEARIC_SLINGERS;
        Roman hastati = Roman.HASTATI;
        //when
        cannaeBattle.dealDamage(slingers, hastati);
        //then
        assertThat(hastati.getHealthPool()).isEqualTo(130);
    }

    @BeforeEach
    void setUp() {
        cannaeBattle = new CannaeBattle();
    }

}