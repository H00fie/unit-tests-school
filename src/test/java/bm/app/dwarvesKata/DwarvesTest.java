package bm.app.dwarvesKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwarvesTest {

    Dwarves dwarves;

    @Test
    void shouldSpawnADwarvenAxemanUnit() {
        //given
        int recruitmentOrder = 5;
        int numberOfRecruitedUnits = 5;
        //when
        dwarves.recruitAxemen();
        //then
    }

    @BeforeEach
    void setUp() {
        dwarves = new Dwarves();
    }

}