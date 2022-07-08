package bm.app.battleOfBannockburnKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BannockburnBattleTest {

    BannockburnBattle bannockburnBattle;

    @Test
    void pikemenShouldFormASchiltron() {
        //given
        Scottish pikemen = Scottish.PIKEMEN;
        //when
        bannockburnBattle.formUp(pikemen);
        //then
        assertThat(pikemen.isInFormation()).isTrue();
    }

    @Test
    void manAtArmsShouldDeal18Damage() {
        //given
        Scottish pikemen = Scottish.PIKEMEN;
        English manAtArms = English.MAN_AT_ARMS;
        int expectedPikemenHealthPool = 582;
        //when
        bannockburnBattle.infantryCharge(manAtArms, pikemen);
        //then
        assertThat(pikemen.getHealthPool()).isEqualTo(expectedPikemenHealthPool);
    }

    @BeforeEach
    void setUp() {
        bannockburnBattle = new BannockburnBattle();
    }

}