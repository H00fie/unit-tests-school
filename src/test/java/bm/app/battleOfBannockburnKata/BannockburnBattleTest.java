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

    @BeforeEach
    void setUp() {
        bannockburnBattle = new BannockburnBattle();
    }

}