package bm.app.forgeKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForgeTest {

    Forge forge;

    @Test
    void shouldForgeTwoAxes() {
        //given
        String weapon = "Axe";
        int quantity = 2;
        //when
        forge.forgeWeapons();
        //then
    }

    @BeforeEach
    public void setUp() {
        forge = new Forge();
    }

}