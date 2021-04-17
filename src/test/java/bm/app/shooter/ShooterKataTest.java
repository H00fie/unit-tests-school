package bm.app.shooter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShooterKataTest {

    ShooterKata shooterKata;

    @Test
    void shouldDeal100Damage() {
        //given
        Weapon weapon = Weapon.HEAVY_CROSSBOW;
        //when
        int damageDealt = shooterKata.dealRawRangedDamage(weapon);
        //then
        assertThat(damageDealt).isEqualTo(100);
    }

    @Test
    void shouldDealHalfTheDamage() {
        //given
        Enemy enemy = Enemy.KNIGHT;
        Weapon weapon = Weapon.BOW;
        //when
        int damageDealt = shooterKata.dealDamage(weapon, enemy);
        //then
        assertThat(damageDealt).isEqualTo(22);
    }

    @BeforeEach
    void setUp() {
        shooterKata = new ShooterKata();
    }

}