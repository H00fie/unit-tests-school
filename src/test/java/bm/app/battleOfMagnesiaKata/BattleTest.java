package bm.app.battleOfMagnesiaKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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

    @BeforeEach
    void setUp() {
        battle = new Battle();
    }

}