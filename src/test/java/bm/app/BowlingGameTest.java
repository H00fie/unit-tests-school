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
        rolling2(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreTwentyWhenOneBowlDownTwentyTimes() {
        rolling2(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldScoreSpare(){
        rolling2(5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(theGame.getScore()).isEqualTo(18);
    }

    @Test
    void shouldScoreStrike(){
        rolling2(10, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(theGame.getScore()).isEqualTo(26);
    }

    private void rolling2(int... bowls){
        for (int bowl : bowls) {
                theGame.roll(bowl);
        }
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
