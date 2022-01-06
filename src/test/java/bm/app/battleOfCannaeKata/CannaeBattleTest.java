package bm.app.battleOfCannaeKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void hastatiUnitShouldBeWipedOut() {
        //given
        Roman hastati = Roman.HASTATI;
        Carthaginian carthaginianNobles = Carthaginian.CARTHAGINIAN_NOBLES;
        //when
        cannaeBattle.dealDamage(carthaginianNobles, hastati);
        UnitStatus result = cannaeBattle.checkUnitStatus(hastati);
        //then
        assertThat(result).isEqualTo(UnitStatus.DEAD);
    }

    @BeforeEach
    void setUp() {
        cannaeBattle = new CannaeBattle();
    }

}