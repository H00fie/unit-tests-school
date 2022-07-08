package bm.app.battleOfBannockburnKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BannockburnBattleTest {

    BannockburnBattle bannockburnBattle;
    ChristianMagic christianMagic;

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

    @Test
    @DisplayName("Christian priest's ressurection spell should bring knights back to life.")
    void priestSpellShouldRessurectKnights() {
        //given
        Scottish scottishKnights = Scottish.KNIGHTS;
        scottishKnights.setHealthPool(0);
        Mockito.when(christianMagic.castRessurection()).thenReturn(1000);
        //when
        bannockburnBattle.castRessurectionSpell(scottishKnights);
        //then
        assertThat(scottishKnights.getHealthPool()).isEqualTo(1000);
    }

    @BeforeEach
    void setUp() {
        christianMagic = Mockito.mock(ChristianMagic.class);
        bannockburnBattle = new BannockburnBattle(christianMagic);
    }

}