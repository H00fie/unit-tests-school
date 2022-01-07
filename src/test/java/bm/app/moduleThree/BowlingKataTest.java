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
        int pinsFelled = 1;
        //when
        bowlingKata.rolling(numberOfThrows, pinsFelled);
        //then
        assertThat(bowlingKata.getScore()).isEqualTo(20);
    }

    @Test
    @DisplayName("20 throws are made and none of them fells a pin.")
    void shouldScoreZeroWhenNoPinDownTwentyTimes() {
        //given
        int numberOfThrows = 20;
        int pinsFelled = 0;
        //when
        bowlingKata.rolling(numberOfThrows, pinsFelled);
        //then
        assertThat(bowlingKata.getScore()).isEqualTo(0);
    }

    @Test
    @DisplayName("10 pins felled in 2 throws awards a Spare - points for the next throw are doubled.")
    void shouldScoreSpare() {
        bowlingKata.rollingWithSpare(2, 5);
        bowlingKata.rollingWithSpare(1, 4);
        bowlingKata.rollingWithSpare(17, 0);
        assertThat(bowlingKata.getScore()).isEqualTo(18);
    }

    @BeforeEach
    void setUp() {
        bowlingKata = new BowlingKata();
    }

}