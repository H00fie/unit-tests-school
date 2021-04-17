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

    @Test
    void shouldDealFullDamage() {
        //given
        Enemy enemy = Enemy.BANDIT;
        Weapon weapon = Weapon.ARBALEST;
        //when
        int damageDealt = shooterKata.dealDamage(weapon, enemy);
        //then
        assertThat(damageDealt).isEqualTo(120);
    }

    @Test
    void shouldKillInstantly() {
        //given
        Weapon weapon = Weapon.HEAVY_CROSSBOW;
        Enemy enemy = Enemy.PEASANT;
        //when
        boolean isAlive = shooterKata.isAlive(weapon, enemy);
        //then
        assertThat(isAlive).isFalse();
    }

    @Test
    void shouldStandGround() {
        //given
        Enemy invader = Enemy.BANDIT;
        Enemy defender = Enemy.KNIGHT;
        //when
        boolean ifHeldGround = shooterKata.ifHeldGround(invader, defender);
        //then
        assertThat(ifHeldGround).isEqualTo(true);
    }

    @BeforeEach
    void setUp() {
        shooterKata = new ShooterKata();
    }

}