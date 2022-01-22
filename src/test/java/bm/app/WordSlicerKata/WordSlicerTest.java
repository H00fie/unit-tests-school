package bm.app.WordSlicerKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class WordSlicerTest {

    WordSlicer wordSlicer;

    @Test
    void shouldDivideProvidedStringIntoTwo() {
        //given
        String providedWord= "building";
        String[] expectedResult = {"buil", "ding"};
        //when
        String[] actualResult = wordSlicer.cutStringInHalf(providedWord);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldDivideProvidedStringIntoSingleCharacters() {
        //given
        String providedWord = "thorakitai";
        char[] expectedResult = {'t', 'h', 'o', 'r', 'a', 'k', 'i', 't', 'a', 'i'};
        //when
        char[] actualResult = wordSlicer.cutStringIntoSingleCharacters(providedWord);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldDivideProvidedStringIntoStringsOfTwoCharacters() {
        //given
        String providedWord = "pezhetairoi";
        String[] expectedResult = {"pe", "zh", "et", "ai", "ro", "i"};
        //when
        String[] actualResult = wordSlicer.cutStringIntoPairs(providedWord);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @BeforeEach
    void setUp() {
        wordSlicer = new WordSlicer();
    }

}