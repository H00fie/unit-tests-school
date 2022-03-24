package bm.app.counterKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import static org.assertj.core.api.Assertions.assertThat;
class CountererTest {

    Counterer counterer;

    @Test
    void shouldSumUpAllOddNumbersLowerThanInput() {
        //given
        int providedNumber = 10;
        int expectedResult = 25;
        //when
        int actualResult = counterer.countOddNumbers(providedNumber);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @BeforeEach
    void setUp() {
        counterer = new Counterer();
    }

}