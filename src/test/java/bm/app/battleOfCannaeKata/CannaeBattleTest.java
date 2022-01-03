package bm.app.battleOfCannaeKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CannaeBattleTest {

    CannaeBattle cannaeBattle;

    @Test
    void numidianCavalryShouldCharge() {
        //given
        String carthaginianUnit = "Numidian Mounted Javelinmen";
        //when
        cannaeBattle.soundTheCharge();
        //then
    }

    @BeforeEach
    void setUp() {
        cannaeBattle = new CannaeBattle();
    }

}