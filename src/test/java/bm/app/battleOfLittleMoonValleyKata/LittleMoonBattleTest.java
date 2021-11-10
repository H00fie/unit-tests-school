package bm.app.battleOfLittleMoonValleyKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class LittleMoonBattleTest {

    LittleMoonBattle littleMoonBattle;

    @Test
    void shouldSpawnTwoUnitsOfCrossbowmen() {
        //given
        int hornBlasts = 2;
        //when
        littleMoonBattle.callForces();
        //then
    }

    @BeforeEach
    void setUp() {
        littleMoonBattle = new LittleMoonBattle();
    }

}