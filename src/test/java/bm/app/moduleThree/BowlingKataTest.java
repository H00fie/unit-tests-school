package bm.app.moduleThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingKataTest {

    BowlingKata bowlingKata;

    @Test
    @DisplayName("No throws made yet, so the score is zero.")
    void shouldScoreOneWhenNoRolls() {
        assertThat(bowlingKata.getScore()).isEqualTo(0);
    }

    @Test
    @DisplayName("A roll fells one pin, so the score is one.")
    void shouldScoreOneWhenRolledOne() {
        bowlingKata.roll(1);
        assertThat(bowlingKata.getScore()).isEqualTo(1);
    }

    @Test
    @DisplayName("20 throws are made and 1 pin is felled every time.")
    void shouldScoreTwentyWhenOnePinDownTwentyTimes() {
        //given
        int numberOfThrows = 20;
        int pinsFell = 1;
        //when
        rolling(numberOfThrows, pinsFell);
        //then
        assertThat(bowlingKata.getScore()).isEqualTo(20);
    }

    @Test
    @DisplayName("20 throws are made and none of them fells a pin.")
    void shouldScoreZeroWhenNoPinDownTwentyTimes() {
        //given
        int numberOfThrows = 20;
        int pinsFell = 0;
        //when
        rolling(numberOfThrows, pinsFell);
        //then
        assertThat(bowlingKata.getScore()).isEqualTo(0);
    }

    private void rolling(int numberOfThrows, int pins) {
        for (int i = 0; i < numberOfThrows; i++) {
            bowlingKata.roll(pins);
        }
    }

    @BeforeEach
    void setUp() {
        bowlingKata = new BowlingKata();
    }

}