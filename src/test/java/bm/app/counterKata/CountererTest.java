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

    @Test
    void shouldSumUpAllNumbersLowerThanInputIfDividableBy3Or5() {
        //given
        int providedNumber = 10;
        int expectedResult = 23;
        //when
        int actualResult = counterer.countDivisorsOf3And5(providedNumber);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldDistributeNumbersFromTheListEvenlyBetweenTheTablesOfTheNumberProvided() {
        //given
        int providedNumberOfArrays = 5;
        int[] providedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[][] expectedResult = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 0}};
        //when
        int[][] actualResult = counterer.createAMultidimensionalArray(providedArray, providedNumberOfArrays);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldCountUpperCaseLetters() {
        //given
        String providedWord = "TheFallOfNumenorIsTheGreatestTragedyOfAllTime";
        int expectedResult = 11;
        //when
        int actualResult = counterer.countUpperCaseLetters(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }


    @BeforeEach
    void setUp() {
        counterer = new Counterer();
    }

}