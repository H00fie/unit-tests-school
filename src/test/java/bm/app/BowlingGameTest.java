package bm.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class BowlingGameTest {

    BowlingGame theGame = new BowlingGame();

    @Test
    public void shouldScoreOneWhenRolledOne(){
        assertThat(theGame.getScore()).isEqualTo(0);
    }

}
