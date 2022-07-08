package bm.app.battleOfBannockburnKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BannockburnBattleTest {

    BannockburnBattle bannockburnBattle;

    @Test
    @DisplayName("Scottish pikemen should form a schiltron.")
    void pikemenShouldFormASchiltron() {
        //given
        Scottish pikemen = Scottish.PIKEMEN;
        //when
        bannockburnBattle.formUp(pikemen);
        //then
        assertThat(pikemen.isInFormation()).isTrue();
    }

    @Test
    @DisplayName("English man-at-arms should deal 18 damage to Scottish pikemen.")
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

    @Test
    @DisplayName("Scottish kngiths' charge should wipe out a unit of English knights.")
    void scottishKnightsShouldKillEnglishKnights() {
        //given
        Scottish scottishKnights = Scottish.KNIGHTS;
        English englishKnights = English.KNIGHTS;
        //when
        bannockburnBattle.cavalryCharge(scottishKnights, englishKnights);
        //then
        assertThat(englishKnights.isAlive()).isFalse();
    }

    @BeforeEach
    void setUp() {
        bannockburnBattle = new BannockburnBattle();
    }

}