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
        String unitName = "Crossbowmen";
        int hornBlasts = 2;
        //when
        littleMoonBattle.callForces(unitName, hornBlasts);
        //then
        assertThat(littleMoonBattle.getArmyOfRodghalikan().get(Unit.CROSSBOWMEN)).isEqualTo(2);
    }

    @Test
    void shouldSpawnThreeUnitsOfPikemen() {
        //given
        String unitName = "Pikemen";
        int hornBlasts = 3;
        //when
        littleMoonBattle.callForces(unitName, hornBlasts);
        //then
        assertThat(littleMoonBattle.getArmyOfRodghalikan().get(Unit.PIKEMEN)).isEqualTo(3);
    }

    @Test
    void shouldDoubleTheDamageOfCrossbowmen() {
        //given
        Unit crossbowmen = Unit.CROSSBOWMEN;
        Foe goblins = Foe.GOBLIN;
        //when
        int expectedResult = 600;
        int actualResult = littleMoonBattle.dealRangedDamage(crossbowmen, goblins);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void dwarvenThunderersShouldPickAHandgun(){
        //given
        Unit thunderers = Unit.THUNDERERS;
        Weapon expectedWeapon = Weapon.HANDGUN;
        //when
        Weapon pickedWeapon = littleMoonBattle.dispenseWeapons(thunderers);
        //then
        assertThat(pickedWeapon).isEqualTo(expectedWeapon);
    }

    @Test
    void dwarvenRockHandsShouldPickAHammer() {
        //given
        Unit rockHands = Unit.ROCK_HANDS;
        Weapon expectedWeapon = Weapon.HAMMER;
        //when
        Weapon pickedWeapon = littleMoonBattle.dispenseWeapons(rockHands);
        //then

    }

    @BeforeEach
    void setUp() {
        littleMoonBattle = new LittleMoonBattle();
    }

}