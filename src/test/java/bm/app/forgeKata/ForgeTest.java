package bm.app.forgeKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class ForgeTest {

    Forge forge;

    @Test
    void shouldForgeTwoAxes() {
        //given
        String weapon = "axe";
        int quantity = 2;
        //when
        forge.forgeWeapons(weapon, quantity);
        //then
        assertThat(forge.getArmoury().get(Weapon.AXE)).isEqualTo(quantity);
    }

    @Test
    void shouldForgeThreeHammers() {
        //given
        String weapon = "hammer";
        int quantity = 3;
        //when
        forge.forgeWeapons(weapon, quantity);
        //then
        assertThat(forge.getArmoury().get(Weapon.HAMMER)).isEqualTo(quantity);
    }

    @Test
    void shouldRemoveOneWeaponFromArmoury() {
        //given
        String weapon = "axe";
        forge.forgeWeapons(weapon, 2);
        int numberOfAxesBeforeIssuing = forge.getArmoury().get(Weapon.AXE);
        int numberOfAxesAfterIssuing = numberOfAxesBeforeIssuing - 1;
        //when
        forge.issueAWeapon(weapon);
        //then
        assertThat(numberOfAxesAfterIssuing).isEqualTo(numberOfAxesBeforeIssuing - 1);
    }

    @Test
    void shouldReturnFalseDueToTheLackOfDesiredWeaponInArmoury() {
        //given
        String weapon = "spear";
        //when
        forge.forgeWeapons(weapon, 3);
        for (int i = 0; i < 3; i++) {
            forge.issueAWeapon(weapon);
        }
        //then
        assertThat(forge.getArmoury().containsKey(Weapon.SPEAR)).isFalse();
    }

    @BeforeEach
    public void setUp() {
        forge = new Forge();
    }

}