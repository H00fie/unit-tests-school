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
        //when
        dwarves.recruitBoarRiders();
        //then
    }

    @BeforeEach
    void setUp() {
        dwarves = new Dwarves();
    }

}