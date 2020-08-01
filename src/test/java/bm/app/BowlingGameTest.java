package bm.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingGameTest {

    BowlingGame theGame;

    @Test
    public void shouldScoreOneWhenNoRolls() {
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreZeroWhenNoBowlsDownTwentyTimes(){
        rolling(20, 0);
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreTwentyWhenOneBowlDownTwentyTimes() {
        rolling(20, 1);
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldScoreSpare(){
        rolling(2, 5);
        rolling(1, 4);
        rolling(17, 0);
        assertThat(theGame.getScore()).isEqualTo(18);
    }

    private void rolling(int numberOfThrows, int bowls) {
        for (int i = 0; i < numberOfThrows; i++) {
            theGame.roll(bowls);
        }
    }

    @BeforeEach
    void setUp() {
        theGame = new BowlingGame();
    }
}
