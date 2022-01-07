package bm.app.moduleThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingKataTest {

    BowlingKata bowlingKata;

    @Test
    void shouldScoreOneWhenNoRolls() {
        assertThat(bowlingKata.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreOneWhenRolledOne() {
        bowlingKata.roll(1);
        assertThat(bowlingKata.getScore()).isEqualTo(1);
    }

    @BeforeEach
    void setUp() {
        bowlingKata = new BowlingKata();
    }

}