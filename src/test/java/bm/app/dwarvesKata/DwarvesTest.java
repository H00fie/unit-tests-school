package bm.app.dwarvesKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class DwarvesTest {

    Dwarves dwarves;

    @Test
    void shouldSpawnADwarvenAxemanUnit() {
        //given
        int recruitmentOrder = 5;
        int expectedNumberOfNewRecruits = 5;
        //when
        dwarves.recruitAxemen(recruitmentOrder);
        //then
        assertThat(dwarves.getNumberOfAxemen()).isEqualTo(expectedNumberOfNewRecruits);
    }

    @Test
    void shouldSpawnTwoUnitsOfDwarvenBoarCavalry() {
        //given
        int amountOfProvisions = 4;
        int expectedNumberOfNewRecruits = 2;
        //when
        dwarves.recruitBoarRiders(amountOfProvisions);
        //then
        assertThat(dwarves.getNumberOfBoarRiders()).isEqualTo(expectedNumberOfNewRecruits);
    }

    @Test
    void shouldSumUpAllWarriors() {
        //given
        int recruitmentOrder = 7;
        int amountOfProvisions = 6;
        int expectedTotalNumberOfWarriors = 10;
        //when
        dwarves.recruitAxemen(recruitmentOrder);
        dwarves.recruitBoarRiders(amountOfProvisions);
        //then
        assertThat(dwarves.getArmyNumbers()).isEqualTo(expectedTotalNumberOfWarriors);
    }

    @BeforeEach
    void setUp() {
        dwarves = new Dwarves();
    }

}