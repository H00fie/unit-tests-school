package bm.app.moduleOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    StringCalculator calculator;

    @Test
    @DisplayName("Should return an integer of a String number provided.")
    void shouldReturnANumberIntWhenANumberStringIsGiven(){
        assertThat(calculator.add("1177")).isEqualTo(1177);
    }

    @Test
    @DisplayName("Should sum up all the numbers provided and divided by commas.")
    void shouldSumUpNumbersProvidedAndDividedByAComma(){
        assertThat(calculator.add("1,2,3")).isEqualTo(6);
    }

    @BeforeEach
    void setUp(){
        calculator = new StringCalculator();
    }



}
