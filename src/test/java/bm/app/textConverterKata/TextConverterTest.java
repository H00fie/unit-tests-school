package bm.app.textConverterKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class TextConverterTest {

    TextConverter textConverter;

    @Test
    void shouldRemoveUnderscores() {
        //given
        String providedWord = "Kislev_is_great";
        String expectedResult = "Kislevisgreat";
        //when
        String actualResult = textConverter.removeUnderscores(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldConvertStringFormatToCamelCase() {
        //given
        String providedWord = "My_little-bear-is_called-Abydon";
        String expectedResult = "myLittleBearIsCalledAbydon";
        //when
        String actualResult = textConverter.convertToCamelCase(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldReplaceAllButLastFourCharactersWithHashtag() {
        //given
        String stringToMaskify = "My little dog's name is Attalos.";
        String expectedResult = "############################los.";
        //when
        String actualResult = textConverter.maskify(stringToMaskify);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldReturnTheProvidedWordDueToASmallNumberOfCharacters() {
        //given
        String providedWord = "ogre";
        String expectedResult = "ogre";
        //when
        String actualResult = textConverter.maskify(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldReplaceEverySecondCharacterWithLetterTIfTheStringContainsThreeCs() {
        //given
        String providedWord = "Cast a shimmering cascade!";
        String expectedResult = "CTsT T ThTmTeTiTgTcTsTaTeT";
        //when
        String actualResult = textConverter.convertToT(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldReplaceAllVowelsWithTomato() {
        //given
        String providedWord = "A mug with Asuna.";
        String expectedResult = "Tomato mTomatog wTomatoth TomatosTomatonTomato.";
        //when
        String actualResult = textConverter.replaceVowelsWithTomato(providedWord);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

//    @Test
//    void shouldSortTheWordsWithinTheStringDependingOnTheirAttachedNumber() {
//        //given
//        String providedString = "the3 ogre5 Greasus1 best4 is2";
//        String expectedResult = "Greasus1 is2 the3 best4 ogre5";
//        //when
//        String actualResult = textConverter.sortTheInternalsByTheirNumbers(providedString);
//        //then
//        assertThat(expectedResult).isEqualTo(actualResult);
//    }



    @BeforeEach
    void setUp() {
        textConverter = new TextConverter();
    }

}