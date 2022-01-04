package bm.app.battleOfMagnesiaKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BattleTest {

    Battle battle;

    @Test
    void phalangitesShouldFormAPhalanx() {
        //given
        Unit phalangites = Unit.PHALANGITES;
        //when
        battle.performBattleTactic(phalangites);
        //then
        assertThat(phalangites.isTactic()).isTrue();
    }

//    @Test
//    void unitNumberShouldDrop() {
//        //given
//        Unit thorakitait = Unit.THORAKITAI;
//        //when
//        battle.enemyGastraphetesVolley();
//        //then
//    }

    @BeforeEach
    void setUp() {
        battle = new Battle();
    }

}