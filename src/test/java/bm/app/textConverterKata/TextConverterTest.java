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

    @BeforeEach
    void setUp() {
        textConverter = new TextConverter();
    }

}