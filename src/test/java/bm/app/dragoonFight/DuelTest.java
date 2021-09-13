package bm.app.dragoonFight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class DuelTest {

    Duel duel;

    @Test
    void shouldDealDamage() {
        //given
        int damage = 100;
        int nidhoggHealth = 1000;
        //when
        int result = duel.performSpineshatteringJump(damage, nidhoggHealth);
        //then
        assertThat(result).isEqualTo(900);
    }

    void dragonFireShouldBeDodged() {
        //given
        Dragon gaurkemil = callADragon(800, 1000, 1500, "Elder");
        Dragoon haurchefaunt = summonADragoon(160, 200, 300, "Chainmail");
        //when
        duel.dragonClaw();
        ///then
    }

    private Dragoon summonADragoon(int health, int power, int speed, String armourType) {
        return new Dragoon(health, power, speed, armourType);
    }

    private Dragon callADragon(int health, int physicalPower, int magicalPower, String dragonType) {
        return new Dragon(health, physicalPower, magicalPower, dragonType);
    }

    @BeforeEach
    void setUp() {
        duel = new Duel();
    }

}