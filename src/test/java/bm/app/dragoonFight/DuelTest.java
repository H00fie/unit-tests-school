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

    @Test
    void dragonClawShouldBeDodged() {
        //given
        Dragon gaurkemil = callADragon("Gaurkemil", 800, 1000, 1500, "Elder");
        Dragoon haurchefaunt = summonADragoon("Haurchefaunt", 160, 200, 300, "Chainmail");
        //when
        duel.dragonClaw(gaurkemil, haurchefaunt);
        ///then
        assertThat(haurchefaunt.getHealth()).isEqualTo(160);
    }

    @Test
    void dragoonShouldBeKilledByTheSpell() {
        //given
        Dragon rasthakor = callADragon("Rasthakor", 900, 600, 2000, "Fey");
        Dragoon eskiel = summonADragoon("Eskiel", 200, 180, 240, "Plate");
        //when
        duel.dragonSpellAttack(rasthakor, eskiel);
        //then
        assertThat(eskiel.getHealth()).isEqualTo(0);
    }

    @Test
    void damageShouldBeDeflectedByAWivern() {
        //given
        Dragon hrasvelgyr = callADragon("Hrasvelgyr", 400, 350, 200, "Wivern");
        Dragoon javier = summonADragoon("Javier", 180, 200, 360, "Mail");
        //when
        duel.waveJumpAttack(javier, hrasvelgyr);
        //then
        assertThat(hrasvelgyr.getHealth()).isEqualTo(400);
    }

    @Test
    void fieldedDragoonsNumberShouldDropByFour() {
        //given
        Dragon ancalong = callADragon("Ancalong", 1000, 2000, 2500, "Elder");
        Dragoon fortaun = summonADragoon("Haurchefaunt", 300, 200, 300, "Chainmail");
        Dragoon ardeu = summonADragoon("Ardeu", 200, 210, 260, "Chainmail");
        Dragoon iorweth = summonADragoon("Iorweth", 150, 150, 290, "Chainmail");
        Dragoon estainin = summonADragoon("Estainin", 320, 500, 340, "Chainmail");
        Dragoon horteins = summonADragoon("Horteins", 150, 200, 600, "Chainmail");
        int numberOfDragoons = duel.getDragoonBattalion().size();
        //when
        duel.dragonSpellAttack(ancalong, fortaun);
        duel.dragonSpellAttack(ancalong, ardeu);
        duel.dragonSpellAttack(ancalong, iorweth);
        duel.dragonSpellAttack(ancalong, estainin);
        //then
        assertThat(duel.getDragoonBattalion().size()).isEqualTo(1);
    }


    private Dragoon summonADragoon(String name, int health, int power, int speed, String armourType) {
        Dragoon dragoon = new Dragoon(name, health, power, speed, armourType);
        swellBattalionsRanks(dragoon);
        return dragoon;
    }

    private void swellBattalionsRanks(Dragoon dragoon) {
        duel.getDragoonBattalion().add(dragoon.getName());
    }

    private Dragon callADragon(String name, int health, int physicalPower, int magicalPower, String dragonType) {
        return new Dragon(name, health, physicalPower, magicalPower, dragonType);
    }

    @BeforeEach
    void setUp() {
        duel = new Duel();
    }

}