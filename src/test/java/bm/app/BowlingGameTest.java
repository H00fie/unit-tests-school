package bm.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class BowlingGameTest {

    BowlingGame theGame;

    public void shouldScoreOneWhenNoRolls() {
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    public void shouldScoreOneWhenRolledOne() {
        theGame.roll(1);
        assertThat(theGame.getScore()).isEqualTo(1);
    }

    @BeforeEach
    void setUp() {
        theGame = new BowlingGame();
    }
}
